import java.util.Scanner;

/**
 * Created by Yoke on 2018/3/29
 */
public class ccf1075 {
    public static void main(String[] args) {
        int n;
        double f = 0, x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            f = Math.sqrt(i + f);
        }
        System.out.println(String.format("%.2f", f));
    }
}
