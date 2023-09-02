/**
 * ClassName: InterTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/8/30 16:39
 * @Version 1.0
 */
public class InterTest {
    public static void main(String[] args){
        CompareA.method1();
        //接口的静态方法实现类不能用
        Inter i = new Inter();
        //默认方法可以
        i.method2();
    }
}
