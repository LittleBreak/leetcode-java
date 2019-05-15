import leetcode.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JewelsAndStones stone = new JewelsAndStones();
        String j = "aA";
        String s = "aAAbbbb";
        int result = stone.numJewelsInStones(j, s);
        System.out.print(result);
    }
}
