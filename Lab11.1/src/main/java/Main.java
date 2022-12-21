public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Nazarii").age(18).gender(Gender.MALE).job("Student(").build();
        System.out.println(user);
    }
}
