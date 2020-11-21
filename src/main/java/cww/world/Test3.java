package cww.world;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {

    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(100, false);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 5L, TimeUnit.SECONDS, arrayBlockingQueue);


        for(int i = 0; i < 100;i++){
            MyThread t = new MyThread(i);
            threadPoolExecutor.submit(t);
        };
        while (true) {
            System.out.println("队列大小"+threadPoolExecutor.getTaskCount());
        }

//        threadPoolExecutor.shutdown();

    }


   static class  MyThread implements  Runnable{
        private int i;

        public MyThread(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("do " + i);
        }
    }
}
