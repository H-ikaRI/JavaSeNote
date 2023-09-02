package tostring;

/**
 * ClassName: toString
 * Package: tostring
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/26 17:07
 * @Version 1.0
 */
public class toString {
    String name = "wadu";
    int age = 12;

    public static void main(String[] args) {


        String str1 = new String("wocao");

        System.out.println(str1.toString());

        System.out.println();
    }

    @Override
    public String toString() {
        return "toString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
