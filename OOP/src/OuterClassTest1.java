/**
 * ClassName: OuterClassTest1
 * Package: PACKAGE_NAME
 * Description:局部内部类的使用
 *
 * @Author: Hjr
 * @Create 2023/8/31 21:10
 * @Version 1.0
 */
public class OuterClassTest1 {
    public Comparable getIns(){
        //开发中的场景
//        //提供了实现了comparable接口的类
        //方式1 提供了接口的实现类的对象
//        class my implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//       my m = new my();
//        return m;
//        //方式2 提供了接口的实现类的匿名对象
//        class my implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new my();
        //方式3 提供了接口的匿名实现类的对象
//        Comparable c = new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//        return c;
        //方式4 提供了接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
