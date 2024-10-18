public class bai10 {
    public static void main(String[] args) {
        int sum = 0;
        int i=0;
        while ( i<= 10 ) {
            sum += i ;
            i+=2;
        }
//        for (int i = 0; i <= 10; i = i + 2) {
//            sum += i;
//        }
        System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
    }
}
