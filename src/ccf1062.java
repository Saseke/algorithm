import java.util.Scanner;

/**
 * 计算曼哈顿距离
 * Created by Yoke on 2018/3/29
 */

public class ccf1062 {
    public static void main(String[] args) {
        float x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }
}
