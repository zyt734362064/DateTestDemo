package Test2022.Test0421;

import java.sql.Struct;

/**
 * Create with IntelliJ IDEA
 * Description:StringBuilder
 * User:Zyt
 * Date:2022-04-21
 */
public class TestDemo1 {
    /**
     * StringBuffer StringBuilder
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.reverse();//逆置
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("123456");
        sb2.reverse();
        System.out.println(sb2);
    }
    /**
     * 局部结论：循环里面的拼接，尽量不要使用String，
     * 优先使用StringBuilder 和StringBuffer
     *
     * @param args
     */
    public static void main3(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < 10; i++) {
            sb.append(i);

        }
        str = sb.toString();
        System.out.println(str);
    }


    /**
     *普通的 String 拼接会被优化为StringBuilder
     * @param args
     */
    public static void main2(String[] args) {
        //String string = "abcdef";
        StringBuilder sb = new StringBuilder();
        sb.append("abcdef");
        //string += "123";
        sb.append("123");
        //string = sb.toString();
        //System.out.println(string);
        System.out.println(sb);
    }
    public static void main1(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.append("123456");
        System.out.println(sb);
    }
}
