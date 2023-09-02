package OOP1_test;

/**
 * ClassName: Employee_test
 * Package: OOP_test
 * Description:
 *
 * @Author: jerry
 * @Create 2023/5/14 12:54
 * @Version 1.0
 */
public class Employee_test {
    //创建类的实例
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);//类型@地址值

        emp1.id = 1001;
        emp1.name = "tom";
        emp1.age = 19;
        emp1.salary = 3000;

        emp1.show();
       // System.out.println("id= "+emp1.id+",name= "+emp1.name+",age= "+emp1.age+",salay= "+emp1.salary);
        System.out.println(emp1.show1());
        Employee emp2 = new Employee();
        emp2.show();
      //  System.out.println("id= "+emp2.id+",name= "+emp2.name+",age= "+emp2.age+",salay= "+emp2.salary);

    }
}
