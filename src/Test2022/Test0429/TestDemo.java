package Test2022.Test0429;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-29
 */
public class TestDemo {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
    }
    public static void main2(String[] args) {
        Integer a = 123;//装箱，装包;
        int b = a;//拆箱，拆包（隐式的）
        System.out.println(a + b);
        System.out.println("------------");
        Integer a2 = Integer.valueOf(123);
        Integer a3 = new Integer(123);//显式的装包

        int b2 = a2.intValue();
        double b3 = a2.doubleValue();//显式的拆包
    }
    public static void main1(String[] args) {
        String str = "123";
        int i = Integer.valueOf(str);
        System.out.println(i + 1);
    }
}
