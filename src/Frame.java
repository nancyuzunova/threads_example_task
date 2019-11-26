public class Frame{

    public void constructFrame(){
        try {
            System.out.println("Start building a frame!");
            Thread.sleep(5000);
            System.out.println("A frame was built.");
        } catch (InterruptedException e) {
            System.out.println("I'm Frame! Someone interrupted me...");
        }
    }
}
