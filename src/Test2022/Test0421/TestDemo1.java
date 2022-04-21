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
     *普通的 String 拼接会被优化为StringBuilder
     * @param args
     */
    public static void main(String[] args) {
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
