package cc.atu123.learn.threads;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wang.lichong  2019/5/16 下午2:25
 * @desc
 * @since
 */
public class LockDemo {

    private ReentrantLock nonfairLock = new ReentrantLock();

    private ReentrantLock fairLock = new ReentrantLock(true);

    private List<String> someFields;

    public void add(String someText) {
        // 等待获得锁，与synchronized类似
        nonfairLock.lock();
        try {
            someFields.add(someText);
        } finally {
            // finally中释放锁是无论如何都不能忘的
            nonfairLock.unlock();
        }
    }

    public void addTimeout(String someText) {
        // 尝试获取，如果10秒没有获取到则立即返回
        try {
            if (!fairLock.tryLock(10, TimeUnit.SECONDS)) {
                return;
            }
        } catch (InterruptedException e) {
            return;
        }
        try {
            someFields.add(someText);
        } finally {
            // finally中释放锁是无论如何都不能忘的
            fairLock.unlock();
        }
    }

}