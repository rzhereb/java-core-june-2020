package threads_hw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicBoolean;

public class WordWriter implements Runnable {

    private final LineStorage lineStorage;
    private AtomicBoolean lineWritten;
    private AtomicBoolean linePrinted;

    private PrintWriter printWriter;

    public WordWriter(LineStorage lineStorage, AtomicBoolean lineFinished, AtomicBoolean linePrinted) throws IOException {
        this.lineStorage = lineStorage;
        this.lineWritten = lineFinished;
        this.linePrinted = linePrinted;
        this.printWriter = new PrintWriter(new FileWriter("words.txt"));
    }

    @Override
    public void run() {
        synchronized (lineStorage) {
            while (!lineStorage.isFinished().get()) {
                while (lineWritten.get()) {
                    try {
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                parseAndWrite(lineStorage.getLine());

                lineWritten.set(true);
                if (linePrinted.get()) {
                    lineStorage.notifyAll();
                }
            }
            System.out.println("WW finished");
        }
    }

    private void parseAndWrite(String line) {
        final String[] split = line.split(" ");
        for (int i = 1; i < split.length; i++) {
            split[i] = "\t" + split[i];
        }
        final String join = String.join("\n", split);
        printWriter.println(join);
        printWriter.flush();
    }
}
