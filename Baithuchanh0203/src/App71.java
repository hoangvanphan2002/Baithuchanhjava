import java.util.Scanner;
public class App71 {
    public static void main(String[] args) {
        int n;
        try (Scanner m = new Scanner(System.in)) {
            do {
                System.out.println("Nhap so phan tu cua mang: ");
                n = m.nextInt();
            } while (n < 0);
            int A[] = new int[n];
            System.out.println("Nhap  cac phan tu cho mang: ");
            for (int i = 0; i < n; i++) {
                System.out.println("nhap phan tu thu " + i + " : ");
                A[i] = m.nextInt();
            }
            // Tinh tong cac so chan trong mang
            double Tong = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] % 2 == 0) {
                    Tong += A[i];
                }
            }
            System.out.println("tong : " + Tong);
        }
}
}