package tostring;

/**
 * ClassName: Circle_test
 * Package: tostring
 * Description:
 *
 *  Circle 的测试类 判断颜色是否相等，利用equals方法判断其半径是否相等
 *  利用tostring方法输出半径
 *
 *
 * @Author: Hjr
 * @Create 2023/5/26 17:29
 * @Version 1.0
 */
public class Circle_test {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.9);
        Circle c2 = new Circle("red",2.3,2.6);
        System.out.println(c1.getColor().equals(c2.getColor()));

        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());

    }
}
