import java.util.LinkedList;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args) {
        //Khai bao 1 LinkedList co ten Minh
        LinkedList<Integer> Minh = new LinkedList<>();

        //nhap n phan tu , ban phim
        int i,number,n;
        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap so phan tu cua LinkedList : ");
            n = m.nextInt();
            for(i = 0 ; i < n ; i++)
            {
                System.out.print("Nhap phan tu thu " + i + " : " );
                number = m.nextInt();
                Minh.add(number);
            }
        }
        System.out.print("Cac phan tu trong mang Manh la : " +Minh);

        //tinh trung binh cong
        int sum = 0, count = 0;
        double tbcong;
        for(i = 0 ; i < n ; i++)
        {
            if(Minh.get(i) % 2 == 0)
            {
                sum += Minh.get(i);
                count++;
            }
        }
        tbcong = (double)sum / count ;
        System.out.println("\n");
        System.out.println("Trung binh cong cac so chan trong Manh la : " + tbcong);
    }
}