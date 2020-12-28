package lesson9;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

//    private static volatile boolean flag = true;
    private static AtomicInteger a = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread("Full-Thread-1", "Roman");
//        myThread.start();

        // JOIN
//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                System.out.println(Thread.currentThread().getName() + ": " + i);
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Runnable runnable2 = () -> {
//            for (int i = 0; i < 7; i++) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Thread thread = new Thread(runnable, "My-Thread-1");
//        Thread thread2 = new Thread(runnable2, "My-Thread-2");
//
//        thread.start();
//        thread.join();
//
//        thread2.start();
//        thread2.join();
//
//        for (int i = 0; i < 5; i++) {
//            //                    Thread.sleep(1000);
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//        }

        // VOLATILE FLAG
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 2000; i++) {
//                System.out.println("value: " + i);
//            }
//            flag = false;
//            System.out.println("Flag status changed to " + flag);
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            int i = 1;
//            @Override
//            public void run() {
//                while (flag) {
//                    i++;
//                }
//                System.out.println("another value: " + i);
//            }
//        });
//        thread1.start();
//        thread2.start();

        // VOLATILE(?) INT
//        Runnable runnable = () -> {
//            while (a.get() < 10) {
//                System.out.println(Thread.currentThread().getName() + ": " + a.incrementAndGet());
//            }
//        };
//        Thread thread1 = new Thread(runnable, "Thread-1");
//        Thread thread2 = new Thread(runnable, "Thread-2");
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(a);


        BankAccount bankAccount = new BankAccount(50);
        CreditCard creditCard1 = new CreditCard(bankAccount);
        CreditCard creditCard2 = new CreditCard(bankAccount);

        CardOwner husband = new CardOwner(creditCard1);
        CardOwner wife = new CardOwner(creditCard2);

        Thread husbandThread = new Thread(husband, "Husband");
        Thread wifeThread = new Thread(wife, "Wife");
        wifeThread.start();
        husbandThread.start();

        husbandThread.join();
        wifeThread.join();

        System.out.println(bankAccount.getAmountOfMoney());

    }
}

