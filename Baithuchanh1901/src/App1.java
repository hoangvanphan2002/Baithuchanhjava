package src;
import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        double a,b,c;

        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap he so a : ");
            a = m.nextDouble();
            System.out.print("Nhap he so b : ");
            b = m.nextDouble();
            System.out.print("Nhap he so c : ");
            c = m.nextDouble();
        }
        double delta = Math.pow(b, 2) - 4*a*c;
        double sqrt = Math.sqrt(delta);

        System.out.println(" Delta cua phuong trinh bac hai : " +delta);
        System.out.println(" Can bac hai cua phuong trinh bac hai : " +sqrt);
        

        if(delta > 0)
        {
            System.out.println(" Phuong trinh co hai nghiem ");
            
            double x1 = -b + sqrt / 2*a;
            System.out.println("Nghiem X1 : " +x1);
            double x2 = -b - sqrt / 2*a;
            System.out.println("Nghiem X2 : " +x2);
        }
        else if(delta == 0)
        {
            System.out.println("Phuong trinh co nghiem kep ");
            
            double x12 = -b / 2*a;
            System.out.println("Nghiem kep cua phuong trinh : " +x12);
        }
        else
        {
            System.out.println("Phuong trinh tren vo nghiem !!!");
        }
    }
}
