public class Seat {

    public void constructSeat(){
        try {
            System.out.println("Start building a seat!");
            Thread.sleep(3000);
            System.out.println("A seat was built!");
        } catch (InterruptedException e) {
            System.out.println("I'm Seat! Someone interrupted me...");
        }
    }
}
