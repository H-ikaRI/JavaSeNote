package OOP1_test;

/**
 * ClassName: StringConCatTest
 * Package: OOP1_test
 * Description:
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串。
 *
 * @Author: jerry
 * @Create 2023/5/17 16:10
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String []args) {
        StringConCatTest str = new StringConCatTest();
        String info = str.concat("-","wd","nmd");

        System.out.println(info);
        String next = str.concat("///", "wuhuq","qifei1");
        System.out.println(next);
    }
    public String concat(String op,String ... strsss){

        String result ="";
        for (int i = 0; i < strsss.length; i++) {
            if(i == 0){
                result += strsss[i];

            }else{
                result+= (op+strsss[i]);
            }
        }

        return result;
    }
}
