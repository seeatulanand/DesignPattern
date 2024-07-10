package singletondesign;

public class main {
    public static void main(String[] args) {
        Employee employee1 = Employee.getEmployee();
        System.out.println(employee1.hashCode());// hashcode is coming same
        Employee employee2 = Employee.getEmployee();
        System.out.println(employee2.hashCode());//hashcode is coming same

    }
}
