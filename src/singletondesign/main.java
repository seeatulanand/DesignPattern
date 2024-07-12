package singletondesign;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class main {
    public static void main(String[] args) throws Exception,CloneNotSupportedException {
        /*Employee employee1 = Employee.getEmployee();
        System.out.println("Employee 1 "+employee1.hashCode());// hashcode is coming same
        Employee employee2 = Employee.getEmployee();
        System.out.println(" Employee 2 "+employee2.hashCode());//hashcode is coming same*/

            //1 breaking singleton design pattern using refelection api.

            /*Constructor<Employee> constructor= Employee.class.getDeclaredConstructor();
            constructor.setAccessible(true); // changing the private constructor to public, changing the Accessiblity.
            Employee employee3 = constructor.newInstance();
            System.out.println("employee3" + employee3.hashCode());*/

            //serialization and deserialization to break the singleton design pattern.
            //solution : implement readResolve method.

       /* Employee employee4 = Employee.getEmployee();
        System.out.println("Employee 4 " + employee4.hashCode());

        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(employee4);
        System.out.println("Serialization done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Employee employee5 = (Employee) ois.readObject();

        System.out.println("Employee 5 "+ employee5.hashCode());*/


        // clone way to break the singleton design pattern.
        Employee employee6 = Employee.getEmployee();
        System.out.println("Employee6 " + employee6.hashCode());
        Employee employee7 = (Employee) employee6.clone();// to clone the Employee implementa the clonable interface
        System.out.println("Employee 7 " + employee7.hashCode());


    }
}
