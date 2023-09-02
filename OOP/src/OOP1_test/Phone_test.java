package OOP1_test;

/**
 * ClassName: Phone_text
 * Package: OOP_test
 * Description:
 *
 * @Author: jerry
 * @Create 2023/5/14 10:48
 * @Version 1.0
 */
public class Phone_test {
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();

        //通过phone的对象调用其内部声明的属性和方法
        //对象.属性或对象.方法
        p1.name = "mi";
        p1.price =4000;
        System.out.println("name = "+p1.name+"\tprice ="+p1.price);

        p1.call();
        p1.sendMessage("有内鬼停止交易");

    }
}
