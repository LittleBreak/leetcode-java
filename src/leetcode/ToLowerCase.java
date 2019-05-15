package leetcode;

// https://leetcode.com/problems/to-lower-case

public class ToLowerCase {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if ('A' <= a[i] && a[i] <= 'Z'){
                // 强制类型转换
                a[i] = (char) (a[i] - 'A' + 'a');
            }

        }

        return new String(a);
    }

}
