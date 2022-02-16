import java.util.Scanner;
/**
 *
 * 
 */
public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1,b1,c1,a2,b2,c2;
        System.out.println("a1 * x + b1 * y = c1");
        System.out.println("a2 * x + b2 * y = c2");
        System.out.println("Nhap a1: ");
        a1 = sc.nextDouble();
        System.out.println("Nhap b1: ");
        b1 = sc.nextDouble();
        System.out.println("Nhap c1: ");
        c1 = sc.nextDouble();
        System.out.println("Nhap a2: ");
        a2 = sc.nextDouble();
        System.out.println("Nhap b2: ");
        b2 = sc.nextDouble();
        System.out.println("Nhap c2: ");
        c2 = sc.nextDouble();
        double D, Dx, Dy, x, y;
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if(D == 0) {
            if(Dx + Dy == 0) {
                System.out.println("He phuong trinh co vo so nghiem!");
            } else {
                System.out.println("He phuong trinh vo nghiem!");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("He phuong trinh co nghiem (x,y) = (%.1f,%.1f)\n", x, y);
        }
    }
}