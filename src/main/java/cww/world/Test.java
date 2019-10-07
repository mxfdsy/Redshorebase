package cww.world;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);



        for (int i = 0; i < 20 ; i++) {
            final int page = i;
            Thread thread = new Thread(() -> {

                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("business"+page);
            });
            thread.start();
        }

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown(); //发枪器递减
        });
        thread.start();
        System.out.println("xxx");

    }
}
