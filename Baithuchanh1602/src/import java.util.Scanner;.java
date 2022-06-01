import java.util.Scanner;

public class App30 {
    public static void main(String[] args) {
        int n,du,tong = 0;

        Scanner m = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        n = m.nextInt();

        while(n>0)
        {
            du = n % 10;
            n = n / 10;
            tong = tong + du;
        }
        System.out.println(" Tong cac chu so do la : " + tong);
    }

}