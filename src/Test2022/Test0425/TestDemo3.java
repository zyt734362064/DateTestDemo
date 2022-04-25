package Test2022.Test0425;

/**
 * Create with IntelliJ IDEA
 * Description:循环异常
 * User:Zyt
 * Date:2022-04-25
 */
public class TestDemo3 {
    public static void main(String[] args) {
        int x = 10;
        while (x >= 0){
            try {
                if (x >= 0){
                    throw new Exception();
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("前面还有" + x + "个人在排队！");
                x--;
            }
        }
        System.out.println("轮到你啦！");
    }
}
