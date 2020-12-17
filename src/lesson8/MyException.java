package lesson8;

public class MyException extends Exception {

    private String veryDetailedMessage;

    public MyException(String message, String veryDetailedMessage) {
        super(message);
        this.veryDetailedMessage = veryDetailedMessage;
    }

    public String getVeryDetailedMessage() {
        return veryDetailedMessage;
    }
}
