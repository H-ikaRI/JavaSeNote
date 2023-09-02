package OOP1_test;

/**
 * ClassName: Person_Test
 * Package: OOP1_test
 * Description:测试封装性
 *
 * @Author: Hjr
 * @Create 2023/5/20 15:59
 * @Version 1.0
 */
public class Person_Test {
    public static void main(String[] args) {
        Person per = new Person();
        per.setAge(60);
        System.out.println(per.getAge());;
    }
}
