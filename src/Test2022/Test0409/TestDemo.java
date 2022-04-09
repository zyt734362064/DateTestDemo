package Test2022.Test0409;

import java.lang.reflect.Field;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-09
 */
public class TestDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "hello";
        // 获取 String 类中的 value 字段. 这个 value 和 String 源码中的 value 是匹配的.
        Field valueField = String.class.getDeclaredField("value");
    // 将这个字段的访问属性设为 true
        valueField.setAccessible(true);
    // 把 str 中的 value 属性获取到.
        char[] value = (char[]) valueField.get(str);
    // 修改 value 的值
        value[0] = 's';

        System.out.println(str);
    }
    public static void main1(String[] args) {
        String str1 = "hello";
        str1 = str1 + " world";
        str1 += "!!!";
        System.out.println(str1);
    }

}
