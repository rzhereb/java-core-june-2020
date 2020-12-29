package threads_hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        LineStorage lineStorage = new LineStorage();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"));

        ContentReader contentReader = new ContentReader(lineStorage, bufferedReader);
        ContentPrinter contentPrinter = new ContentPrinter(lineStorage);

        new Thread(contentPrinter).start();
        new Thread(contentReader).start();
    }
}
