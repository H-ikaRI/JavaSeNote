package OOP1_test;

/**
 * ClassName: Person
 * Package: OOP1_test
 * Description:创建程序，定义两个类，person和persontest类，定义如下
 * 用setage（）设置人的合法年龄（0-130）有getage（）返回人的年龄
 * 在persontest中实例化person的对象b，调用setage和getage
 *
 * @Author: Hjr
 * @Create 2023/5/20 15:57
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int a) {
        if(a<=130 && a>=0){
            age = a;
        }else {
            System.out.println("输入不合法");
        }
    }
    public int getAge(){
       return age;
    }
}
