package cc.atu123.learn.threads;

/**
 * @author wang.lichong  2019/5/15 下午2:28
 * @desc
 * @since
 */
public class WaitDemo {

    private volatile static boolean lock;

    public static void main(String[] args) throws InterruptedException {
        final Object object = new Object();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("等待被通知！");
                try {
                    synchronized (object) {
                        while (!lock) {
                            object.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("已被通知");
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("马上开始通知！");
                synchronized (object) {
                    object.notify();
                    lock = true;
                }
                System.out.println("已通知");
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(100000);
    }
}