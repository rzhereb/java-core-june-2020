package lesson9;

public class MyThread extends Thread {

    private String whoCreated;

    public MyThread(String name, String whoCreated) {
        super(name);
        this.whoCreated = whoCreated;
    }

    @Override
    public void run() {
        System.out.println(whoCreated);
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}

