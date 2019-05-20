package cc.atu123.learn.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author wang.lichong  2019/5/16 下午3:50
 * @desc
 * @since
 */
public class CyclicBarrierDemo {


    public static void main(String[] args) {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        for (int i = 0; i < 10; i++) {
            final int number = i + 1;
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    System.out.println("等待执行任务[" + number + "]");
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                    } catch (BrokenBarrierException e) {
                    }
                    System.out.println("开始执行任务[" + number + "]");
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
