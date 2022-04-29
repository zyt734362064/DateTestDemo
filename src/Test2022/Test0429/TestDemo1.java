package Test2022.Test0429;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-29
 */
public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");//add 方法默认放到数组的最后一个位置
        System.out.println(list2);
        list2.add(0,"888");
        System.out.println(list2);
        ArrayList<String> list = new ArrayList<>();
        list.add("春天");
        list.add("夏天");
        list2.addAll(list);
        System.out.println(list2);
    }
    public static void main3(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");//add 方法默认放到数组的最后一个位置
        System.out.println(list2);
        list2.add(0,"888");
        System.out.println(list2);
        ArrayList<String> list = new ArrayList<>();
        list.add("春天");
        list2.addAll(list);
        System.out.println(list2);
        //ArrayList<String> list1 = new ArrayList<>();
        CopyOnWriteArrayList list1 = new CopyOnWriteArrayList();
        list1.add("hello");
        list1.add("nihao");
        list1.add("hahah");
        System.out.println(list1);
/*        System.out.println("-----------");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        for (String s:list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("=====迭代器打印====");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }*/
        System.out.println();
        System.out.println("======迭代器List相关打印=======");
        //ListIterator<String> it2 = list1.listIterator();
        ListIterator<String> it2 = list1.listIterator();
        /*while (it2.hasNext()){
            String str = it2.next();
            if (str.equals("hello")){
                it2.remove();
            }else {
                System.out.print(str + " ");
            }
        }*/
        while (it2.hasNext()){
            String ret = it2.next();
            if (ret.equals("hello")){
                list1.add("STA");
            }else {
                System.out.print(ret + " ");
            }
        }
        System.out.println(list1);
    }
}
