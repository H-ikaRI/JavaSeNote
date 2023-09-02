/**
 * ClassName: Inter
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/8/30 16:39
 * @Version 1.0
 */
public class Inter implements CompareA{
    String name = "tom";
    int age = 1;
    //非静态内部类
    class inr{//内部类
       String name = "够吧";
    public void e() {//方法
    System.out.println("5");
    }
    public void show(String name){
        System.out.println("age = "+age);
        System.out.println("name = "+name);
        System.out.println("name = "+Inter.this.name);
    }
 }
 //静态内部类
    static class ine{
        public void a(){
            System.out.println("6");
        }
    }
    public static void main(String[] args) {
        //内部类的实现
        Inter in = new Inter();

        Inter.inr i = in.new inr();
        i.e();
        i.show("叠  ");
        ine a = new ine();
        a.a();
        //接口的实现
        CompareA.method1();
        in.method2();
    }
}
