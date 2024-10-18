import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên N: ");
        int N = scanner.nextInt();

        int tong = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int so = scanner.nextInt();
            tong += so;
        }

        System.out.println("Tổng của " + N + " số nguyên là: " + tong);

        scanner.close();
    }
}
