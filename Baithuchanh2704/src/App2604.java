import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;
import java.util.Scanner;
public class App2604 {
    public static void main(String[] args) throws Exception {
        Point p = new Point();
        Quadrilateral q = new Quadrilateral();
        Triangle t = new Triangle();

       System.out.print("\tNhập sự lựa chọn của bạn : ");
         System.out.print("\t1. Nhập tọa độ cho mặt phẳng OXY : ");
         System.out.print("\t2. Nhập và kiểm tra tam giác : ");
         System.out.print("\t3. Nhập và kiểm tra tứ giác : ");
         System.out.print("\t0. thoat : ");

         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap su lua chon cua ban : ");
            int luachon = sc.nextInt();
            if( luachon == 1 )
            {
                 p.nhap();
                 p.in();
            }
            else if ( luachon == 2 )
            {
                 t.Nhap();
                 t.test();
            }
            else if ( luachon == 3 )
            {
                q.kiemtra();
            }
            else if ( luachon == 4 )
            {
                return;
            }
        }

}
}