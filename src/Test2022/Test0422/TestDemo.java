package Test2022.Test0422;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * Description:异常
 * User:Zyt
 * Date:2022-04-22
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(10 / n);
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("输入有误！");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("算数异常，可能是0作为了除数");
        }finally {
            sc.close();
            System.out.println("finally 执行了！");
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3};
        try{
            System.out.println(array[2]);//可能会抛出异常

            System.out.println("打印array");
            System.out.println(array[9]);//可能会抛出异常
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印出红色异常部分
            System.out.println("我捕捉到了一个数组越界异常！");
        }
        System.out.println("你好！！");
    }
}
