package threads_hw;

public class ContentPrinter implements Runnable {

    private final LineStorage lineStorage;

    public ContentPrinter(LineStorage lineStorage) {
        this.lineStorage = lineStorage;
    }

    @Override
    public void run() {
        synchronized (lineStorage) {
            while (!lineStorage.isFinished().get()) {
                try {
                    lineStorage.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(lineStorage.getLine());
                lineStorage.notify();
            }
            System.out.println("Done");
        }
    }

}
