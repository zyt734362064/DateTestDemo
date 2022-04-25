package Test2022.Test0425;

import javax.naming.Name;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-25
 */
class NameException extends RuntimeException{
    public NameException(String message){
        super(message);
    }
}
class passwordException extends RuntimeException{
    public passwordException(String message){
        super(message);
    }
}


public class TestDemo {
    private static String userName = "admin";
    private static String password = "123456";
    public static void main(String[] args) {
        try{
            login("admin","123");
        }catch (NameException e){
            System.out.println("用户名错误！");
        }catch (passwordException e){
            System.out.println("密码错误了！");
        }finally {
            System.out.println("finally 执行了");
        }
    }

    public static void login(String userName, String password) throws NameException {
        if (!TestDemo.userName.equals(userName)){
            //TODO 处理用户名错误
            //System.out.println("用户名错误！");
            throw new NameException("用户名错误！");
        }else if (!TestDemo.password.equals(password)) {
            // TODO 处理密码错误
            //System.out.println("密码错误！");
            throw new passwordException("密码错误!");
        }else {
            System.out.println("登录成功！");
        }
    }
}
