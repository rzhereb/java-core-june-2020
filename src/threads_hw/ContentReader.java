package threads_hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ContentReader implements Runnable {

    private final LineStorage lineStorage;
    private BufferedReader bufferedReader;
    private AtomicBoolean lineWritten;
    private AtomicBoolean linePrinted;

    public ContentReader(LineStorage lineStorage, BufferedReader bufferedReader, AtomicBoolean lineWritten, AtomicBoolean linePrinted) {
        this.lineStorage = lineStorage;
        this.bufferedReader = bufferedReader;
        this.lineWritten = lineWritten;
        this.linePrinted = linePrinted;
    }

    @Override
    public void run() {
        String line;
        synchronized (lineStorage) {
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    lineStorage.setLine(line);

                    linePrinted.set(false);
                    lineWritten.set(false);

                    lineStorage.notifyAll();
                    try {
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            lineStorage.isFinished().set(true);
            linePrinted.set(false);
            lineWritten.set(false);
            lineStorage.notifyAll();
        }
    }
}
