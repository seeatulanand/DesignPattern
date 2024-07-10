package factorydesign;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println( "Android Developer Salary " + employee.salary());

    }
}
