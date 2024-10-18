public class bai14 {
    public static void main(String[] args) {
        // Kiểm tra xem có tham số nào được truyền vào không
        if (args.length == 0) {
            System.out.println("Vui lòng nhập giá trị n từ dòng lệnh.");
            return;
        }

        // Lấy giá trị n từ tham số đầu tiên
        int n = Integer.parseInt(args[0]);

        int sum = 0;

        // Nếu n là số chẵn
        if (n % 2 == 0) {
            for (int i = 1; i < n; i += 2) {
                sum += i;
            }
        } else { // Nếu n là số lẻ
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
        }

        System.out.println("Tổng là: " + sum);
    }
}