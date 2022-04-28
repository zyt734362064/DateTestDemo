package Test2022.Test0428;

/**
 * Create with IntelliJ IDEA
 * Description:
 * User:Zyt
 * Date:2022-04-28
 */
public class TestDemo1 {
    public static void main(String[] args) {
        String s = ("abbcccddddeeeeedcba");
        System.out.println(calMacLen(s));
    }
    public static int calMacLen(String str){
        int len = 1;
        int max = 1;
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] == s[i + 1]){
                len++;
                max = Math.max(len,max);
            }else {
                len = 1;
            }
        }
        return max;
    }
}
