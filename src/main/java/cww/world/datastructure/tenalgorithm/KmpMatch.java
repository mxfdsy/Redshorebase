package cww.world.datastructure.tenalgorithm;

import java.util.Arrays;

/**
 * kmp 算法
 */
public class KmpMatch {
    public static void main(String[] args) {

        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        //String str2 = "BBC";

        int[] next = kmpNext("ABCDABD"); //[0, 1, 2, 0]
        System.out.println("next=" + Arrays.toString(next));

        int index = kmpSearch(str1, str2, next);
        System.out.println("index=" + index); // 15��
    }


    public static int kmpSearch(String str1, String str2, int[] next) {

        for (int i = 0, j = 0; i < str1.length(); i++) {

            //算法核心部分（减少了匹配的次数 即已经匹配过的无需再次匹配）
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }

            //当前字符是相等的
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                //这里要加一是因为 i 是后面才++的
                return i - j + 1;
            }
        }
        return -1;
    }


    public static int[] kmpNext(String dest) {

        int[] next = new int[dest.length()];
        //对于只有一份字符来讲 他的值肯定是0
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {

            //这里是kmp 算法的核心 如果要搞清楚要看详解
            while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }

            //如果 前缀 后缀 有相同的则加一
            if (dest.charAt(i) == dest.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;

    }
}