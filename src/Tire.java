public class Tire extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Start building a tire!");
            Thread.sleep(2000);
            System.out.println("A tire was built.");
        } catch (InterruptedException e) {
            System.out.println("I'm Tire! Someone interrupted me...");
        }
    }
}
