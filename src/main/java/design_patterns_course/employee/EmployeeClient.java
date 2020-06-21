package design_patterns_course.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        var listOfEmployees = new ArrayList<Employee>();
        var employeeDb = new EmployeeDb("1234", "John", "Doe", "john@gmail.com");
        listOfEmployees.add(employeeDb);

        EmployeeLdap employeeLdap = new EmployeeLdap("ldab", "Solo", "Bek", "solo@gmail.com");

        listOfEmployees.add(new EmployeeLdapAdapter(employeeLdap));
        return listOfEmployees;
    }
}
