package Test2022.Test0428;

/**
 * Create with IntelliJ IDEA
 * Description:判断字符串是否为回文
 * User:Zyt
 * Date:2022-04-28
 */
public class TestDemo {
    public  boolean isPaLindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j && i < j - 1) {
            if (chars[i] != chars[j]) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        if (i == j - 1) {
            if (chars[i] != chars[j]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cccCBCCC";
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.isPaLindrome(s));
    }
}
