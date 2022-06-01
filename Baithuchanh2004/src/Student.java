package Package;
import java.util.Scanner;
public class Student extends Person {
    private float toan , ly , hoa , tb;

    public void nhap ()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap diem mon toan : ");
            toan = sc.nextFloat();
            System.out.print("Nhap diem mon ly : ");
            ly = sc.nextFloat();
            System.out.print("Nhap diem mon hoa : ");
            hoa = sc.nextFloat();
        }
        tb = (toan + ly + hoa ) / 3 ;
    }
    public void in()
    {
        System.out.print("Diem mon toan : " + toan );
        System.out.print("Diem mon ly : " + ly);
        System.out.print("Diem mon toan : " + hoa );
        System.out.print("Dem trung binh  : " + tb);
    }
}