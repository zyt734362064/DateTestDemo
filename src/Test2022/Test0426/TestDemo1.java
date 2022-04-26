package Test2022.Test0426;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-26
 */
 class NameException extends RuntimeException{
     public NameException(String message){
         super(message);
     }
}
class PasswordException extends RuntimeException{
     public PasswordException(String message){
         super(message);
     }
}

public class TestDemo1 {
    private static String userName = "zyt";
    private static String password = "111";
    public static void main(String[] args) {
       try {
           logic("zyt","123");
       }catch (NameException e){
           //e.printStackTrace();
           System.out.println("用户名错误了！");
       }catch (PasswordException e){
           //e.printStackTrace();
           System.out.println("密码错误了！");
       }
    }

    public static void logic(String userName,String password){
        if (!TestDemo1.userName.equals(userName)){
            throw new NameException("用户名错误！");
        }else if (!TestDemo1.password.equals(password)){
            throw new PasswordException("密码错误!");
        }else {
            System.out.println("登陆成功！");
        }
    }
}
