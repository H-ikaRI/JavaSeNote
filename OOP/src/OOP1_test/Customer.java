package OOP1_test;

/**
 * ClassName: Customer
 * Package: OOP1_test
 * Description:
 *所谓javabean是指符合以下标准的java类：
 * ①类是公共的
 * ②有一个无参的公共的构造器
 * ③有属性，且有对应的get，set方法
 *
 *
 * @Author: Hjr
 * @Create 2023/5/21 19:45
 * @Version 1.0
 */
public class Customer {

    public Customer(){

    }
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }



}
