
import java.util.*;

public class Sail_298B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long destX = sc.nextLong();
        long destY = sc.nextLong();
        String dir = sc.next();
        long xDiff = destX - x;
        long yDiff = destY - y;
        char changeInX = ' ';
        if (xDiff > 0) {
            changeInX = 'E';
        } else if (xDiff < 0) {
            changeInX = 'W';
        }
        char changeInY = ' ';
        if (yDiff > 0) {
            changeInY = 'N';
        } else if (yDiff < 0) {
            changeInY = 'S';
        }
        xDiff = Math.abs(xDiff);
        yDiff = Math.abs(yDiff);
        boolean flag = false;
        for (int i = 0; i < dir.length(); i++) {
            if (dir.charAt(i) == changeInX && xDiff > 0) {
                xDiff--;
            } else if (dir.charAt(i) == changeInY && yDiff > 0) {
                yDiff--;
            }
            if (xDiff == 0 && yDiff == 0) {
                System.out.println(i + 1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
