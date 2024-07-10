package factorydesign;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Android Developer salary");
        return 500000;
    }
}
