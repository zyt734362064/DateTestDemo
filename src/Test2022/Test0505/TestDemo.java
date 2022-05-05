package Test2022.Test0505;

import java.util.Arrays;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-05-05
 */
class MyArrayList<E>{
    private Object[] elementData;//代表当前数组
    private int usedSize;//代表有效的数据个数

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    public MyArrayList(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public MyArrayList(int capacity){
        if (capacity > 0){
            this.elementData = new Object[capacity];
        }else if (capacity == 0){
            this.elementData = new Object[0];
        }else {
            throw new IllegalArgumentException("初始化容量不能为负数");
        }
    }

    /**
     * 添加元素，相当于存放在数组的最后位置
     * @param e
     * @return
     */
    public boolean add(E e){
        //确定一个真正的容量，预测->扩容
        //把检查顺序表空和满，以及扩容放到了一起
        ensureCapacityInternal(usedSize + 1);
        elementData[usedSize] = e;
        usedSize++;
        return true;
    }

    private void ensureCapacityInternal(int minCapacity){
        //计算出需要的容量
        int capacity = calculateCapacity(elementData,minCapacity);
        //2、拿着记算出的容量，去看满了扩容，空了分配内容
        ensureExplicitCapacity(capacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        //进不去if语句，就没放满
        if (minCapacity - elementData.length > 0){
            //扩容
            grow(minCapacity);
        }
    }

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity + 1);
        if (newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0){
            newCapacity = hugeCapacity(minCapacity);
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0){
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE ) ?
                Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    private static int calculateCapacity(Object[] elementData,int minCapacity){
        //1、是否之前elementData 数组分配过大小
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA){
            return Math.max(10,minCapacity);
        }
        //2、分配过就返回 +1后的值
        return minCapacity;
    }

    public void add(int index,E e){
        //1、确定index 位置
        rangeChangeForAdd(index);
        //2、确定真正的容量
        ensureCapacityInternal(usedSize + 1);
        copy(index,e);
        usedSize++;
    }

    private void rangeChangeForAdd(int index) {
        if(index < 0 || index >size()){
            throw new IndexOutOfBoundsException("index位置不合法");
        }
    }

    private void copy(int index,E e){
        for (int i = usedSize - 1; i >= index ; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = e;
    }

    private int size() {
        return this.usedSize;
    }

}

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("a");
        myArrayList.add("ab");
        myArrayList.add("abc");
        myArrayList.add("abcd");
        myArrayList.add(4,"zzz");
        System.out.println(myArrayList);
    }

}
