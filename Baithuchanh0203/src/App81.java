import java.util.Scanner;

public class App81 {
    public static void main(String[] args) {
        int m,n;
        try (Scanner sc = new Scanner(Systeam.in)) {
            System.out.println("Nhap vao so dong cua ma tran : ");
            m = sc.nextInt();
            System.out.println("Nhap vao so cot cua ma tran : ");
            n = sc.nextInt();
            int A[][] = new int[m][n];
            System.out.println("Nhap cac phan tu cho ma tran :");
            for(int i = 0 ; i < m; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    System.out.print("A["+i+"]["+j+"]=");
                }
            }
        }
}
}