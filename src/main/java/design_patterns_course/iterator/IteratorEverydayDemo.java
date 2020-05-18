package design_patterns_course.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEverydayDemo {
    public static void main(String[] args) {
//        var names = new ArrayList<String>();
        var names = new HashSet<String>();
        names.add("Brian");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesItr = names.iterator();

        for (String name: names) {
            System.out.println(name);
        }

        while (namesItr.hasNext()){
            var name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        System.out.println("Names size: "+names.size());
    }
}
