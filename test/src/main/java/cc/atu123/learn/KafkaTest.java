package cc.atu123.learn;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: lichongwang  Date: 2018/1/29 Time: 11:59
 */
public class KafkaTest {
    volatile static boolean stop = false;
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "10.18.75.121:9092,10.18.75.122:9092,10.18.75.123:9092,10.18.75.124:9092,10.18.75.125:9092,10.18.75.126:9092,10.18.75.127:9092,10.18.75.128:9092,10.18.75.129:9092,10.18.75.130:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "test2");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        //props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 10);
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        consumer.subscribe(Collections.singleton("external-mp-news"));
        Lock lock = new ReentrantLock(true);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(60_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                stop = true;
            }
        }).start();
        ExecutorService service = Executors.newFixedThreadPool(10);
        do {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    ConsumerRecords<String, String> poll = consumer.poll(100);
                    lock.unlock();
                    for (ConsumerRecord<String, String> record : poll) {
                        long timestamp = Long.parseLong(JSON.parseObject(record.value(), AppLog.class).getReqTime());
                        long now =  System.currentTimeMillis()/1000;
                        if (now - timestamp > 60) {
                            System.out.println("log time:" + timestamp);
                            System.out.println("now time:" + now);
                            System.out.println("延迟：" +  (now - timestamp) +" s");
                            System.out.println(record.value());
                        }
                        System.out.println(record.value());
                    }
                    //consumer.commitAsync();
                }
            });
        }while (!stop);
        consumer.close();

    }
}
