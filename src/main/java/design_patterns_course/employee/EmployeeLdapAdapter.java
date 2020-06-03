package design_patterns_course.employee;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap instance;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.instance = employeeLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }

    @Override
    public String toString() {
        return "EmployeeLdab{" +
                "id='" + instance.getCn() + '\'' +
                ", firstName='" + instance.getGivenName() + '\'' +
                ", lastName='" + instance.getSurname() + '\'' +
                ", email='" + instance.getEmail() + '\'' +
                '}';
    }
}
