package Test2022.Test0422;

/**
 * Create with IntelliJ IDEA
 * Description:异常
 * User:Zyt
 * Date:2022-04-22
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        try{
            System.out.println(array[5]);//可能会抛出异常
            System.out.println("打印array");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印出红色异常部分
            System.out.println("我捕捉到了一个数组越界异常！");
        }
        System.out.println("你好！！");
    }
}
