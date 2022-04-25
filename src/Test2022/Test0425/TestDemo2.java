package Test2022.Test0425;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-25
 */
public class TestDemo2 {
    public static void main(String[] args) {
        func(10);
    }

    public static void func(int x) {
        int i = 0;
        while (i != x) {
            try {
                if (i != x) {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("重新加载" + i + "次");
                i++;
            }
        }
        System.out.println("加载结束！");
    }
}