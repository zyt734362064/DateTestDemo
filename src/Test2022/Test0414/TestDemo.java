package Test2022.Test0414;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-14
 */
public class TestDemo {
    public static void main(String[] args) {
        String str = "Java 12&21#hello";
        String[] strings = str.split(" |&|#");
        for (String s:strings) {
            System.out.println(s);
        }
    }
    public static void main3(String[] args) {
        String str = "192.168.1.1";
        String[] strings = str.split("\\.");
        for (String s:strings) {
            System.out.println(s);
        }
    }

    public static boolean isNumberChar(String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean flag = Character.isDigit(c);
            if (flag == false){
                return false;
            }
            /*if (c < '1' || c > '9' ){
                return false;
            }*/
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "1234567849";
        System.out.println(isNumberChar(str));
    }
    public static void main1(String[] args) {
        char[] chars = {'a','b','c','d','e','f'};
        System.out.println(chars);
        String str = new String(chars);
        System.out.println(str);
        String str1 = new String(chars,2,3);
        System.out.println(str1);
        System.out.println("==========");
        String str2 = "hello";
        char ch = str2.charAt(2);//获取到2下标的字符
        System.out.println(ch);
        str2.toCharArray();//把str2指向的字符串对象变成字符数组
        System.out.println(Arrays.toString(str2.toCharArray()));
    }
}
