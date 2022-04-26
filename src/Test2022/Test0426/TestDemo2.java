package Test2022.Test0426;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-26
 */
public class TestDemo2 {
    public static void main(String[] args) {
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
