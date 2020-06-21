package design_patterns_course.singleton;

import java.sql.Connection;
import java.sql.Date;

public class SingletonDemo {
    public static void main(String[] args) {
        var beforeTime =0d;
        var afterTime = 0d;
        var singleton = DbSingleton.getInstance();
        var singleton2 = DbSingleton.getInstance();
        var singleton3 = DbSingleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton3);
        System.out.println(singleton2);

        beforeTime = System.currentTimeMillis();
        Connection connection = singleton.getConnection();
        afterTime = System.currentTimeMillis();
        System.out.println(afterTime-beforeTime);

        beforeTime = System.currentTimeMillis();
        Connection connection2 = singleton.getConnection();
        afterTime = System.currentTimeMillis();
        System.out.println(afterTime-beforeTime);
    }
}
