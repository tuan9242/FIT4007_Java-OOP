public class Bai12 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0) {
                sum += i;
            }

        }
        System.out.println("Tong cac boi cua 7 la "+ sum);
    }
}
