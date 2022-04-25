package Test2022.Test0425;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-25
 */
class myException extends Exception {
    //首查异常
    public myException(String message){
        super(message);
    }
}
class myException2 extends RuntimeException {
    //非首查异常
    public myException2(String message){
        super(message);
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        func3(0);
    }

    public static void func1(int x){
        try {
            if (x == 0){
                throw new myException("嘿嘿");
            }
        }catch (myException e){
            e.printStackTrace();
        }
    }

    public static void func2(int x) throws myException {
        if (x == 0){
            throw new myException("haha");
        }
    }
    public static void func3(int x) throws myException2 {
        try {
            if (x == 0) {
                throw new myException2("嘿嘿2");
            }
        } catch (myException2 e) {
            e.printStackTrace();
        }
    }
}
