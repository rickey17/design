package com.rickey.develop.design.structure.flyweight;

import java.util.Vector;

/**
 * Created by Rickey_17 on 17-4-2.
 * 享元模式的主要目的是实现对象的共享，即共享池
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection conn = null;

    /*构造方法，做一些初始化工作*/
    private ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                //conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 返回连接到连接池 */
    public synchronized void release() {
        pool.add(conn);
    }

    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
