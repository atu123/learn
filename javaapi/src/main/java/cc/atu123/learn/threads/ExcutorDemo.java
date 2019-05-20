package cc.atu123.learn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wang.lichong  2019/5/16 下午5:03
 * @desc
 * @since
 */
public class ExcutorDemo {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 1000000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("abc");
                }
            });
        }

        executorService.shutdown();

    }
}
