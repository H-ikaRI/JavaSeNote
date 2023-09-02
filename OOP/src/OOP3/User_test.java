package OOP3;

/**
 * ClassName: User_test
 * Package: OOP3
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/31 18:20
 * @Version 1.0
 */
public class User_test {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getinfo());

        User u2 = new User("tom","55550");
        System.out.println(u2.getinfo());
        System.out.println();
        User1 u3 = new User1();
        System.out.println(u3.getinfo());
    }
}
