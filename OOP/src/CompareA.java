/**
 * ClassName: CompareA
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/8/30 16:37
 * @Version 1.0
 */
public interface CompareA {
//静态方法
    public static void method1(){
        System.out.println("ss");
    }
    //默认方法
    public default void method2(){
        System.out.println("sss");
    }
}
