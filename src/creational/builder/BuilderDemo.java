package creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Dinesh", "Bhardwaj")
                .middleName("Kumar")
                .age(35)
                .address("New Delhi")
                .phone("9205090699")
                .build();

        System.out.println(user);
    }
}
