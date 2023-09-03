/**
 * ClassName: Num7
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/9/3 16:14
 * @Version 1.0
 */
public class Num7 {
    public static void main(String[] args){
        int a = -21;
        System.out.println(reserve(a));
    }
    public static int reserve(int x){
    //判断是否为负数
        String r = "";
        String xs = x+"";
        String f = "";
        if(xs.substring(0,1).equals("-")){
            f = "-";
            xs = xs.substring(1);
        }
        //反转
        for (int i = xs.length()-1; i >= 0 ; i--) {
            r += xs.charAt(i);
        }
        //返回结果
        try{
            return Integer.parseInt(f+r);
        }catch(Exception e){
            return 0;
        }
    }
}
