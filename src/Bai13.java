public class Bai13 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập giá trị n từ command line.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 1) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tổng của dãy số từ 1 đến " + n + " là: " + sum);
    }
}
