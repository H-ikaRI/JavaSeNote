package OOP1_test;

/**
 * ClassName: OverLoadExer
 * Package: OOP_test
 * Description:定义三个重载方法并调用，方法名为mOL
 * 三个方法分别接受一个int参数，两个int参数，一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 *
 * @Author: jerry
 * @Create 2023/5/17 15:30
 * @Version 1.0
 */
public class OverLoadExer {

    public void mOL(int num){
        System.out.println(num*num);
    }
    public void mOL(int num1,int num2){
        System.out.println(num1*num2);
    }
    public void mOL(String mess){
        System.out.println(mess);
    }

}
