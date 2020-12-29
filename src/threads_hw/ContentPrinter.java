package threads_hw;

import java.util.concurrent.atomic.AtomicBoolean;

public class ContentPrinter implements Runnable {

    private final LineStorage lineStorage;
    private AtomicBoolean linePrinted;
    private AtomicBoolean lineWritten;


    public ContentPrinter(LineStorage lineStorage, AtomicBoolean linePrinted, AtomicBoolean lineWritten) {
        this.lineStorage = lineStorage;
        this.linePrinted = linePrinted;
        this.lineWritten = lineWritten;
    }

    @Override
    public void run() {
        synchronized (lineStorage) {
            while (!lineStorage.isFinished().get()) {
                while (linePrinted.get()) {
                    try {
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(lineStorage.getLine());

                linePrinted.set(true);
                if (lineWritten.get()) {
                    lineStorage.notifyAll();
                }
            }
            System.out.println("CP finished");
        }
    }

}
