package Test2022.Test0414;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-14
 */


public class Example {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str + "and");
        System.out.println(ex.ch);
    }
    public  void change(String str,char[] ch){
        str = "test ok";
        ch[0] = 'g';
    }
}
