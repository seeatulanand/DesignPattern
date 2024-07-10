package builderdesign;

public class main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().
                setEmailId("abc@gmail.com").
                setUserId("User1234").
                setUserName("Atul").build();

        System.out.println(user);
    }
}
