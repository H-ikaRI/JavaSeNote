package OOP2_test.interview;

/**
 * ClassName: Person_test
 * Package: OOP2_test.interview
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/25 16:02
 * @Version 1.0
 */
public class Person_test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Man m1 = new Man();



        Person p2 = new Man();//多态性
        p2.eat();
        Person p3 = new Women();
        p3.walk();

        if (p2 instanceof Man){//判断对象p2是不是类Man的实例。父类也是
            System.out.println("1");
        }



    }
}
