import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        int number, sum = 0;
        try (Scanner m = new Scanner(System.in)) {
            do{
              System.out.println("Nhap so nguyen : ");
              number = m.nextInt();
              sum += number;
            }while (sum<100);
        }
        System.out.println("Tong cac so nguyen vua nhap = " + sum);
    }
}