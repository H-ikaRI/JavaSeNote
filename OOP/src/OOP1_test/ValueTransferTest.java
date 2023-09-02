package OOP1_test;

/**
 * ClassName: ValueTransferTest
 * Package: OOP1_test
 * Description:值传递机制测试
 *
 * @Author: jerry
 * @Create 2023/5/17 16:30
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        ValueTransferTest value = new ValueTransferTest();
        int m =  10;
        value.method(m);
        System.out.println(m);

    }
    public void method(int m){
        m++;
    }
}
