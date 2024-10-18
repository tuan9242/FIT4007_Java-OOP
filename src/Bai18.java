public class Bai18 {
    public static void main(String[] args) {
        System.out.println("Các bội số của 3 từ 3 đến 300 là:");

        for (int i = 3; i <= 300; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}