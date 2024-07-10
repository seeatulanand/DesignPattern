package singletondesign;

public class Employee {

    private static volatile Employee INSTANCE=null;

    private Employee(){

    }

    public static Employee getEmployee(){
        if(INSTANCE==null){
            synchronized (Employee.class) {
                if(INSTANCE==null) INSTANCE = new Employee();
            }
        }
        return INSTANCE;

    }
}
