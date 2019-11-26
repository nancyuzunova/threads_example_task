public class Demo {

    public static void main(String[] args) {
        System.out.println("Let's build a car!\n");
        long timeStart = System.currentTimeMillis();
        Thread line1 = new Thread(()->{
            Engine engine = new Engine();
            engine.constructEngine();
            Frame frame = new Frame();
            frame.constructFrame();
        });
        Thread line2 = new Thread(()->{
            for (int i = 0; i < 4; i++) {
                Seat seat = new Seat();
                seat.constructSeat();
            }
        });
        Thread line3 = new Thread(()->{
            Seat seat = new Seat();
            seat.constructSeat();
            for (int i = 0; i < 4; i++) {
                Tire tire = new Tire();
                tire.constructTire();
            }
        });
        line1.start();
        line2.start();
        line3.start();
        try {
            line1.join();
            line2.join();
            line3.join();
        } catch (InterruptedException e) {
            System.out.println("Some problem happened!");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nThe car is ready");
        System.out.println("It was built for " + (endTime - timeStart) / 1000 + " seconds");
    }
}
