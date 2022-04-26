package Test2022.Test0426;

import java.util.*;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-26
 */
public class TestDemo2 {



    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("黑旋风","李逵");
        map.put("行者","武松");
        /*String val = map.get("及时雨");
        System.out.println(val);
        System.out.println(map.containsKey("行者"));*/
        System.out.println(map);
        System.out.println("===========");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet) {
            System.out.println("key:" + entry.getKey() + " val:" + entry.getValue());
        }

    }
    public static void main1(String[] args) {
        Collection<String> con = new ArrayList<>();
        con.add("hello");
        con.add("hello1");
        con.add("hello2");
        // con.add(1);
        System.out.println(con);
        Object[] objects = con.toArray();
        System.out.println(Arrays.toString(objects));
        /*System.out.println("===========");
        con.clear();
        System.out.println(con);*/
    }
}
