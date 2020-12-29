package threads_hw;

import java.util.concurrent.atomic.AtomicBoolean;

public class LineStorage {

    private String line = "";
    private AtomicBoolean isFinished = new AtomicBoolean(false);

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public AtomicBoolean isFinished() {
        return isFinished;
    }

}
