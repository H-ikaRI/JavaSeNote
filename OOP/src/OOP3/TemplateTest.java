package OOP3;

/**
 * ClassName: TemplateTest
 * Package: OOP3
 * Description:
 * 模板设计模式学习,内含判断质数的函数
 *
 * @Author: Hjr
 * @Create 2023/8/5 20:36
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        Print p = new Print();
        p.spendTime();
    }
}
//计算某段代码的执行需要花费的时间
abstract class Template{
    public void spendTime(){

        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为"+(end - start)+"ms");
    }
    public abstract void code();

}
class Print extends Template{
    @Override
    public void code(){
        System.out.println("2-100000所有的质数为：");
        //判断2-100000的质数
        for (int i = 2; i < 100000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
