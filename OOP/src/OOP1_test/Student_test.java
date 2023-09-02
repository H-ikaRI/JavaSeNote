package OOP1_test;

/**
 * ClassName: Student_test
 * Package: OOP_test
 * Description:创建20个学生对象，学号为1-20，年级和成绩都随机
 * 问题：用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * @Author: jerry
 * @Create 2023/5/15 21:27
 * @Version 1.0
 */
public class Student_test {
    public static void main(String[] args) {

        Student[] stus = new Student[20];
        for (int i = 0; i < stus.length; i++) {

            stus[i] = new Student();
            stus[i].number = i+1;
            stus[i].score = (int)(Math.random()*101);
            stus[i].state = (int)(Math.random()*6+1);

        }
        //打印出三年级的学生信息
        StudentUtil util = new StudentUtil();
        util.search(stus,5);
        System.out.println("*******");
        //遍历未排序的学生列表
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].show());
        }
        System.out.println("**************");
        //冒泡,从小到大排序
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length-1-i; j++) {
            if (stus[j].score>stus[j+1].score){
                Student temp = stus[j];
                stus[j] = stus[j+1];
                stus[j+1] = temp;
            }
            }
        }
        //遍历
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].show());
        }
    }
}
