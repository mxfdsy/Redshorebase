package cww.world.datastructure.tenalgorithm;

/**
 * 暴力匹配
 */
public class ViolenceMatch {
    public static void main(String[] args) {
        String str1 = "硅硅谷 尚硅谷你尚硅 尚硅谷你尚硅谷你尚硅你好";
        String str2 = "尚硅谷你尚硅你";
        int index = violenceMatch(str1, str2);
        System.out.println("index=" + index);
    }

    public static int violenceMatch(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1Len = s1.length;
        int s2Len = s2.length;

        int i = 0;
        int j = 0;


        while (i < s1Len && j < s2Len) {// ��֤ƥ��ʱ����Խ��

            if(s1[i] == s2[j]) {//ƥ��ok
                i++;
                j++;
            } else { //û��ƥ��ɹ�
                //eg:如果两个字符串匹配到最后的的一个字符不符，i应该回滚到最早匹配的i+ 1除 即 i - (j - 1);
                i = i - (j - 1);
                j = 0;
            }
        }


        if (j == s2Len) {
            return i - j;
        } else {
            return -1;
        }
    }
}
