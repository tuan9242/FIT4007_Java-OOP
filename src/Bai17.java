import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Số 0");
        } else if (number % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }

        scanner.close();
    }
}
