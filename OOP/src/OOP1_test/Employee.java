package OOP1_test;

/**
 * ClassName: Employee
 * Package: OOP_test
 * Description:
 *
 * @Author: jerry
 * @Create 2023/5/14 12:53
 * @Version 1.0
 */
public class Employee {
    //属性或成员变量或实例变量
    int id;
    String name;
    int age;
    double salary;
    public void show(){
        System.out.println("id= "+id+",name= "+name+",age= "+age+",salay= "+salary);
    }
    public String show1(){
        return "id= "+id+",name= "+name+",age= "+age+",salay= "+salary;
    }
}
