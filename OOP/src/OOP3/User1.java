package OOP3;

/**
 * ClassName: User1
 * Package: OOP3
 * Description:
 *
 *  代码块的使用
 * @Author: Hjr
 * @Create 2023/5/31 18:23
 * @Version 1.0
 */
public class User1 {
    private String userName;
    private String password;
    private long registrationTime;//注册时间

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }
    public User1(){
//        System.out.println("新用户注册");
//        registrationTime = System.currentTimeMillis();//获取系统当前时间1970年一月一日到现在的毫秒数
        userName = System.currentTimeMillis()+"";
        password = "123456";
    }

    public User1(String userName,String password){
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }
    public String getinfo(){
        return "用户名："+ userName+",密码："+password + "，注册时间："+registrationTime;
    }
}
