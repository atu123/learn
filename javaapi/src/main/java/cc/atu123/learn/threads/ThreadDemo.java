package cc.atu123.learn.threads;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author wang.lichong  2019/5/16 下午4:27
 * @desc
 * @since
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
/*

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getId());
                }
            });
            thread.setName("aaa");
            thread.start();
        }


        for(int i=0;i<10;i++){
            Thread thread = new Thread(){
                @Override
                public void run () {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getId());
                }
            };
            thread.setName("B");
            thread.start();
        }

*/

        ExecutorService service = Executors.newFixedThreadPool(100);

        // 20个线程
        for (int i = 0; i < 20; i++) {
            service.execute(() -> {
                for (int j = 0; j < 1; j++) {
                    try {
                        Thread.sleep(10000l);
                        System.out.println(new Date());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        //shutdown会禁止线程池接受新任务，在执行的任务执行完后，关闭线程池，不会阻塞主线程
        service.shutdown();
        System.out.println("hahahha");

        //阻塞主线程，等待5秒
        service.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("hahahha");

    }
}

class ThreadDemo1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
