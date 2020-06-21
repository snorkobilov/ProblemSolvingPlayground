package design_patterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        Singleton thirdInstance = Singleton.getInstance();

        System.out.println(firstInstance);
        System.out.println(secondInstance);
        System.out.println(thirdInstance);

        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 1);

        System.out.println(myMap.get(4));

        System.out.println(myMap.keySet().size());
    }
}
