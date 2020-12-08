package design_patterns_course.singleton;

//import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static volatile DbSingleton instance = null;
    private static volatile Connection connection = null;

    private DbSingleton() {
//        try {
//            DriverManager.registerDriver(new EmbeddedDriver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        if (connection != null) {
            throw new RuntimeException("Use get connection method");
        }
        if (instance != null) {
            throw new RuntimeException("Use get Instance method");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }

        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            synchronized (DbSingleton.class) {
                if (connection == null) {
                    try {
                        var connUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        connection = DriverManager.getConnection(connUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
        return connection;
    }
}
