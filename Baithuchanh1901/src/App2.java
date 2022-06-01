package src;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        double A1,B1,C1,A2,B2,C2;
    
    try (Scanner m = new Scanner(System.in)) {
        System.out.print("Nhap he so A1 : ");
        A1 = m.nextDouble();
        System.out.print("Nhap he so B1 : ");
        B1 = m.nextDouble();
        System.out.print("Nhap he so C1 : ");
        C1 = m.nextDouble();
        System.out.print("Nhap he so A2 : ");
        A2 = m.nextDouble();
        System.out.print("Nhap he so B2 ; ");
        B2 = m.nextDouble();
        System.out.print("Nhap he so C2 : ");
        C2 = m.nextDouble();
    }
    double dd= A1*B2 - B1*A2;
    double dx= C1*B2 - B1*C2; 
    double dy= A1*C2 - A2*C1;
    
    if(dd==0)
      if(dx==0 && dy==0)
      {
        System.out.println("He vo so nghiem !!!");
      }
      else System.out.println("He vo nghiem !!!");
    else
      System.out.println("He co nghiem duy nhat" + " x=" + (dx/dd) + " va y= " +(dy/dd));
    }
}
