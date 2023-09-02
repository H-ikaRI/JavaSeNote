package OOP2_test;

/**
 * ClassName: Student
 * Package: OOP2_test
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/24 16:03
 * @Version 1.0
 */
public class Student000 extends Person000 {

    String school;
    public void study(){
        System.out.println("学生不会学习");
    }
    public void eat(){
        System.out.println("学生不许吃");;
    }
    public void sleep(){
        System.out.println("学生不许睡觉");
    }
    public void show(){
        super.eat();//直接在父类寻找该方法
        this.eat();//先在本类中寻找，本类中没有到父类中寻找
    }
    public void show1(){
        sport();
    }
        public Student000(){

        super();
            System.out.println(111);
        }
        public Student000(String name, int age){

        }



}
