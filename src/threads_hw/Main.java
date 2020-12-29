package threads_hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) throws IOException {
        LineStorage lineStorage = new LineStorage();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"));

        AtomicBoolean linePrinted = new AtomicBoolean(false);
        AtomicBoolean lineWritten = new AtomicBoolean(false);

        ContentReader contentReader = new ContentReader(lineStorage, bufferedReader, lineWritten, linePrinted);
        ContentPrinter contentPrinter = new ContentPrinter(lineStorage, linePrinted, lineWritten);
        WordWriter wordWriter = new WordWriter(lineStorage, lineWritten, linePrinted);

        new Thread(wordWriter).start();
        new Thread(contentPrinter).start();
        new Thread(contentReader).start();
    }
}
