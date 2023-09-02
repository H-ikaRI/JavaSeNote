package OOP2_test;

/**
 * ClassName: Order_test
 * Package: OOP2_test
 * Description:
 *      order 的测试类
 * @Author: Hjr
 * @Create 2023/5/26 16:52
 * @Version 1.0
 */
public class Order_test {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"耶");
        Order order2 = new Order(1001,"耶");
        System.out.println(order1.equals(order2));
        Order order3 = new Order(1002,new String("yeye"));
        Order order4 = new Order(1002,new String("yeye"));
        System.out.println(order3.equals(order4));

    }
}
