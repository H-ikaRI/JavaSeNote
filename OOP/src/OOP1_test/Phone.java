package OOP1_test;

/**
 * ClassName: Phone
 * Package: com
 * Description:
 *
 * @Author: jerry
 * @Create 2023/5/14 10:41
 * @Version 1.0
 */
public class Phone {
        //属性
        String name;
        double price;

        //方法
    public void call(){
        System.out.println("能够拨打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送信息:"+message);
    }
    public void playGame(){
        System.out.println("玩游戏");

    }

}
