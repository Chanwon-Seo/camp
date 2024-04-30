package week05.multi;


public class Main {
    public static void main(String[] args) {
        Runnable tast1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        Runnable tast2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(tast1);
        thread1.setName("thread1");
        Thread thread2 = new Thread(tast2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
