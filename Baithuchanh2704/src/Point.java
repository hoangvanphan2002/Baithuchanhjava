package Shape;
import java.util.Scanner;
public class Point {
    public String ten;
    public float hoanhdo,tungdo;
    public void get()
    {

    }
    public void set()
    {
        
    }
    public void nhap() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Nhap ten toa do : ");
            ten = sc.nextLine();
        System.out.print("Nhap hoanh do : ");
            hoanhdo = sc.nextFloat();
        System.out.print("Nhap tung do  : ");
            tungdo = sc.nextFloat();
    }
    }
    public void in()
    {
        System.out.printf("Diem co toa do : %s(%f,%f) " ,hoanhdo,tungdo );
    }
}