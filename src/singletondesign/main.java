package singletondesign;

import java.lang.reflect.Constructor;

public class main {
    public static void main(String[] args) throws Exception{
        Employee employee1 = Employee.getEmployee();
        System.out.println(employee1.hashCode());// hashcode is coming same
        Employee employee2 = Employee.getEmployee();
        System.out.println(employee2.hashCode());//hashcode is coming same

            //1breaking singleton design pattern using refelection api.

            Constructor<Employee> constructor= Employee.class.getDeclaredConstructor();
            constructor.setAccessible(true); // changing the private constructor to public, changing the Accessiblity.
            Employee employee3 = constructor.newInstance();
            System.out.println("employee3" + employee3.hashCode());

            // serialization and deserialization to break the singleton design pattern.
    }
}
