package design_patterns_course.employee;

public class AdapterDemo {
    public static void main(String[] args) {
        var employeeClient = new EmployeeClient();
        var list = employeeClient.getEmployeeList();

        list.forEach(System.out::println);
    }
}
