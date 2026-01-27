package ex1;
public class Main {

    public static void main(String[] args) {

        Runnable task = () -> {
            Logger logger = Logger.getInstanceMulti();
            logger.writeLine("Written by " + Thread.currentThread().getName() +" | Logger content: " + "Hello " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName()+" wrote to file, content: "+ "Hello " + Thread.currentThread().getName());
        };

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(task, "Thread-" + (i + 1));
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n--- Log File Content ---");
        Logger.getInstanceMulti().readLine();
    }
}
