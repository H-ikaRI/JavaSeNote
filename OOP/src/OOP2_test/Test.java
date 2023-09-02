package OOP2_test;

/**
 * ClassName: Test
 * Package: OOP2_test
 * Description:
 *    继承性测试
 * @Author: Hjr
 * @Create 2023/5/24 16:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        Student000 s1 = new Student000();
        System.out.println("**********");
        s1.eat();
        s1.sleep();
        s1.show();
        Student000 s2 = new Student000();
        System.out.println("**********");
        Student000 s3 = new Student000("tom",12);


    }
}
