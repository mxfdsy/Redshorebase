package cww.world.java8.CompletableFuture;

import org.junit.Test;

import java.util.concurrent.*;

public class CompletableFutureTest {

    //java8以前
    @Test
    public void test1() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return Thread.currentThread().getName();
            }
        });

        doSomethingElse();//在我们异步操作的同时一样可以做其他操作
        try {
            String res = future.get();
            System.out.println(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    //正常new
    @Test
    public void test2() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            completableFuture.complete(Thread.currentThread().getName());
        }).start();

        doSomethingElse();//做你想做的其他操作

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    //工厂方法
    @Test
    public void test3() {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return Thread.currentThread().getName();
        });

        doSomethingElse();//做你想做的耗时操作

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    //test4
    public void test4() throws ExecutionException, InterruptedException {


    }


    public void doSomethingElse() {

        for (int i = 0; i < 50; i++) {
            System.out.println("我在做其他的事情,等3s后我要的数据才来");
        }

    }

}