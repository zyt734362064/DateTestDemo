package Test2022.Test0426;

import javax.naming.Name;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-26
 */
 class NameRunException extends RuntimeException{
    public NameRunException(String message){
        super(message);
    }

}
class PasswordRunException extends RuntimeException{
     public PasswordRunException(String message){
         super(message);
     }
}
public class TestDemo {
    private static String userName = "zyt";
    private static String password = "123";

    public static void main(String[] args) {
        try {
            logic("zyt","23");
        }catch (NameRunException e){
            System.out.println("用户名错误，登录失败！");
        }catch (PasswordRunException e){
            System.out.println("密码错误，登陆失败！");
        }
    }

    public static void logic(String userName,String password){
        if (!TestDemo.userName.equals(userName)){
            throw new NameRunException("用户名错误！");
        } else if (!TestDemo.password.equals(password)) {
            throw new PasswordException("密码错误！");
        }else {
            System.out.println("登陆成功！");
        }
    }
}
