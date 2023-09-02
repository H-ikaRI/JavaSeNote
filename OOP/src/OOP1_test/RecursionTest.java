package OOP1_test;

/**
 * ClassName: RecursionTest
 * Package: OOP1_test
 * Description:递归方法测试
 *计算1-100内自然数总和 和 n的阶乘
 * @Author: jerry
 * @Create 2023/5/17 17:48
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest re = new RecursionTest();
        int n = 100;
        int sum = re.getSum(n);
        System.out.println(sum);
    }
    public int getSum(int i){
        if(i == 1){
            return 1;
        }else {
            return i + getSum(i-1);
        }
    }
}
