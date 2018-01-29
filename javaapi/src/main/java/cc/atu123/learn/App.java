package cc.atu123.learn;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchAlgorithmException {
       /* *//*int _1MB = 1024*1024;
        ByteBuffer.allocate(_1MB*4);
        System.out.println("Allocation success");
        ByteBuffer.allocate(_1MB*5);
        System.out.println("Allocation success");
        ByteBuffer.allocate(_1MB*2);
        System.out.println("Allocation success");*//*

        Thread thread1 = new Thread(new Thread1());
        thread1.start();
        Thread thread2 = new Thread2();
        thread2.start();*/
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println(yyyyMMdd.format(LocalDate.parse("20171206", yyyyMMdd).minusDays(1l)));
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i am thread1 ");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("i am thread2");
    }
}