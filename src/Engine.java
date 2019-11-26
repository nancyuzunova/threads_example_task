public class Engine{

    public void constructEngine(){
        try {
            System.out.println("Start building engine!");
            Thread.sleep(7000);
            System.out.println("An engine was built.");
        } catch (InterruptedException e) {
            System.out.println("I'm Engine! Someone interrupted me...");
        }
    }
}
