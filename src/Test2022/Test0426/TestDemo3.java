package Test2022.Test0426;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-26
 */
//<>代表当前类是一个泛型类,此时的E，是一个占位符
class MyArrayList<E> {

    private E[] elem;
    private int usedSize;

    public MyArrayList(){
        this.elem = (E[]) new Object[10];
    }

    public void add(Object val){
        this.elem[usedSize] = (E) val;
        this.usedSize++;
    }
    public E get(int pos){
        return (E) this.elem[pos];
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        MyArrayList<Double> myArrayList2 = new MyArrayList<>();
        myArrayList.add("ads");
        myArrayList1.add(1);
        myArrayList2.add(1.3);
        System.out.println(myArrayList);
        System.out.println(myArrayList1);
        System.out.println(myArrayList2);
    }
    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("money");
        int i = (Integer)myArrayList.get(0);
        String ret = (String)myArrayList.get(1);
        System.out.println(ret);
        System.out.println(i);
    }
}
