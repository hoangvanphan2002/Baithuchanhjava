import java.util.ArrayList;

import java.util.Comparator;

import java.util.Scanner;
public class App109 {
    public static void main(String[] args) throws Exception {
        // khai bao 1 arraylist co ten Minh
        ArrayList<Integer> Minh = new ArrayList<>();
        
        //Them cac so nguyen vo mang Minh
        Minh.add(5);
        Minh.add(2);
        Minh.add(8);
        Minh.add(12);
        Minh.add(15);
        Minh.add(10);
        Minh.add(7);
        System.out.println("Cac phan tu trong mang : " +Minh);
        
        //gia tri max trong day
        int max = Minh.get(0) ;
        for(int i = 1 ; i < Minh.size() ; i++)
        {
            if(Minh.get(i).compareTo(max)>0)
            {
                max = Minh.get(i);
            }
        }
        System.out.println("Gia tri lon nhat trong day Manh la : " +max);
        
        //Nhap vao 1 so nguyen , trung xoa 
        int number;
        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap vao 1 so nguyen : ");
            number = m.nextInt();
        }
        Minh.add(number);
       
        
        //sap xep danh sach tang dan va in
        Minh.sort(Comparator.comparingInt(o -> o));
        System.out.println("Cac phan tu co trong Manh da sap xep la : " +Minh);
    }
}