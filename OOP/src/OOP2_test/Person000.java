package OOP2_test;

/**
 * ClassName: Person
 * Package: OOP2_test
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/24 15:58
 * @Version 1.0
 */
public class Person000 {

    String name;
    private int age;
    int id = 100;

    public void eat(){
        System.out.println("人恰饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sport(){
        System.out.println("运动");
    }

    public Person000() {
        System.out.println("000");
    }

    public Person000(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person000(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }





}
