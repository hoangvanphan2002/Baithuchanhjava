import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        int n, soDu, sum = 0;
        System.out.println("Nhập số nguyên dương: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            sum += soDu;
        }
             
        System.out.println("Tổng các chữ số = " + sum);

    }
}