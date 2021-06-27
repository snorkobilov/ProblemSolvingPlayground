import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Comparator<Employee> comparator = Comparator.comparing(Employee::getId).reversed();
        Queue<Employee> priorityQueue = new PriorityQueue<>(comparator);
        priorityQueue.add(new Employee(11L, "AA", LocalDateTime.now()));
        priorityQueue.add(new Employee(12L, "AAb", LocalDateTime.now()));
        priorityQueue.add(new Employee(13L, "AAc", LocalDateTime.now()));
        priorityQueue.add(new Employee(14L, "AAd", LocalDateTime.now()));
        priorityQueue.add(new Employee(9L, "AAdx", LocalDateTime.now()));

        var id = 0;
        while (id < 3) {
            var employee = priorityQueue.poll();
            System.out.println(employee);
            if (employee == null) break;
            id++;
        }
    }


}

class Employee implements Comparable<Employee> {

    private Long id;
    private String name;
    private LocalDateTime date;

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Employee(Long id, String name, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return getId().compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
