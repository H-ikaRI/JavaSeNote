package OOP1_test;

/**
 * ClassName: StudentUtil
 * Package: OOP_test
 * Description:
 *
 * @Author: jerry
 * @Create 2023/5/15 22:03
 * @Version 1.0
 */
public class StudentUtil {
    //打印指定年级的学生信息
    public void search(Student[] stus,int state) {
        for (int i = 0; i < stus.length; i++) {
            if(state == stus[i].state){
                Student stu = stus[i];
                System.out.println(stu.show());
            }
        }
    }
}
