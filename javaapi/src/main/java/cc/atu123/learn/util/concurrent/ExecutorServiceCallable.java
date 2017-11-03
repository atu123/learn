package cc.atu123.learn.util.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: lichongwang  Date: 2017/11/2 Time: 16:35
 */
public class ExecutorServiceCallable {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("begin");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);

        final List<Callable<Boolean>> todoList = new CopyOnWriteArrayList<>();
        for (int i = 1 ;i<=5;i++){
            todoList.add(new Callablehandler());
        }
        executorService2.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("add todList");
                    System.out.println(todoList.size());
                    todoList.add(new Callablehandler());
                }
            }
        });
        executorService.invokeAll(todoList);
        while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("线程池没有关闭");
        }

        System.out.println("end<<<<<<<<<<<<");
    }

    public static class  Callablehandler implements Callable<Boolean>{
        public Callablehandler() {

        }
        @Override
        public Boolean call() throws Exception {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(">>>>>>>>>>>>>>>>>>>");
            return true;
        }
    }
}
