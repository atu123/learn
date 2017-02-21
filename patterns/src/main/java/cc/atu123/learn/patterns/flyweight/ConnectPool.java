package cc.atu123.learn.patterns.flyweight;

import java.sql.Connection;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/15
 * Time: 18:14
 */
public class ConnectPool {
    private Vector<Connection> pool;
    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private ConnectPool(){
        AtomicInteger ai = new AtomicInteger();

    }
}
