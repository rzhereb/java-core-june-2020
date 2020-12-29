package threads_hw;

import java.io.BufferedReader;
import java.io.IOException;

public class ContentReader implements Runnable {

    private final LineStorage lineStorage;
    private BufferedReader bufferedReader;

    public ContentReader(LineStorage lineStorage, BufferedReader bufferedReader) {
        this.lineStorage = lineStorage;
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void run() {
        String line;
        synchronized (lineStorage) {
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    lineStorage.setLine(line);
                    lineStorage.notify();
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
            lineStorage.notify();
        }
    }
}
