import java.util.Scanner;
public class App11 {
    public static void main(String[] args) {
        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap so phan tu cua mang : ");
            int n = m.nextInt();
            int [] arr = new int [n];
            System.out.print("Nhap cac phan tu cua mang : \n");
            for (int i = 0; i < n; i++) {
                System.out.printf("a[%d] = ", i);
                arr[i] = m.nextInt();
            }
            System.out.println("Day so truoc sap xep tang dan : ");
            show(arr);
            System.out.println();
            sortASC(arr);
            System.out.println("Day so duoc sap xep tang đan : ");
            show(arr);
        }
      }
      public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
      public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
      }
    }
}