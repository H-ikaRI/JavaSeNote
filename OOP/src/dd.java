/**
 * ClassName: StringBuilder
 * Package: PACKAGE_NAME
 * Description:stringbuilder的使用
 *
 * @Author: Hjr
 * @Create 2023/9/1 22:12
 * @Version 1.0
 */
public class dd {
    public static void main(String[] args) {
        String a = "aa";
        System.out.println("");
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1;i <= 100000;i ++){
            sb.append(a);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
