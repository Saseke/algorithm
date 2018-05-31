import java.util.Scanner;

 class IndoorSix_A {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double sum = 0;
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
            }
            System.out.printf("%.2f\n", sum / n);
        }
    }
}
