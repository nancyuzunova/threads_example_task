public class Frame extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Start building a frame!");
            Thread.sleep(5000);
            System.out.println("A frame was built.");
        } catch (InterruptedException e) {
            System.out.println("I'm Frame! Someone interrupted me...");
        }
    }
}
