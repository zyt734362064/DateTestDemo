package Test2022.Test0407;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:字符串String
 * User:Zyt
 * Date:2022-04-07
 */
public class TestDemo2 {

    public static void main(String[] args) {

    }



    public static void func(String s,char[] array){
        s = "new";
        array[0] = 'p';
    }

    public static void main3(String[] args) {
        String str = "abcdef";
        char[] chars = {'b','i','t'};
        func(str,chars);
        System.out.println(str);
        System.out.println(Arrays.toString(chars));
    }
    public static void main2(String[] args) {
        String str = "abcdef";
        String str2 = str;
        System.out.println(str);
        System.out.println(str2);
        str = "88888";
        System.out.println("============");
        System.out.println(str);
        System.out.println(str2);
    }
    public static void main1(String[] args) {
        String str = "abcdef";
        String string = new String("abcdef");

        char[] chars = {'a','b','c'};
        String str3 = new String(chars);
        System.out.println(str3);
    }
}
