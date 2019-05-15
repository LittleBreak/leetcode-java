package leetcode;

// https://leetcode.com/problems/jewels-and-stones/

/*
* String是个final类，不允许扩展
* final类的所有方法自动变成final的方法，但是域不会自动变成final的。
* */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        // Replaces each substring of this string that matches the given regular expression with the given replacement.
        return S.replaceAll("[^" + J + "]", "").length();

    }
}
