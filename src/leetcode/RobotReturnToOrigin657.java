package leetcode;



/*
* 机器人是在一个二维坐标轴上
* 字符串顺序并不影响位置
* 两个变量控制x,y坐标
* */
public class RobotReturnToOrigin657 {
    public boolean judgeCiDrcle(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }
}
