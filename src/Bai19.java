import java.util.Scanner;
public class Bai19 {
    public static void main(String[] args) {
        //step1 :input nhap vao chuoi
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String chuoi = sc.nextLine();
        //step2 :process
        int count=0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'a') {
                count++;
            }
        }
        //step3 : ouput
        System.out.println("So lan ky tu xuat hien la"+ count);
    }
}
