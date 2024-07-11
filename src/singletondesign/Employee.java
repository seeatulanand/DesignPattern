package singletondesign;

public class Employee {

    private static volatile Employee INSTANCE=null;
    private Employee(){
        // to stop breaking the singleton design pattern in constructor check object is created
        //or not. If created throw exception.

        if(INSTANCE!=null){
            throw new RuntimeException("Trying to break singleton pattern");
        }

    }
    public static Employee getEmployee(){
        if(INSTANCE==null){
            synchronized (Employee.class) {
                if(INSTANCE==null) INSTANCE = new Employee();
            }
        }
        return INSTANCE;

    }

    /*Way to break singleton design pattern
    * 1) Reflection API.
    * 2) Serialization and deserialization.
    *
    *
    * */
}
