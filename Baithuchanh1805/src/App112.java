import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class App112 {
    public static void main(String[] args) {
        String name;
        int n;
        HashSet<String> minh = new HashSet<>();
        try (Scanner m = new Scanner(System.in)) {
            //nhap ten trai cay
            System.out.print("Nhap vao so trai cay max trong minh : ");
            n = Integer.parseInt(m.nextLine());
            
            System.out.println("Nhap vao cac loai trai cay  ");
            for(int i = 1 ; i < n ; i++)
            {
                System.out.println("Nhap ten loai trai cay thu " + i + " la : ");
                name = m.nextLine();
                minh.add(name);
            }

            //hien thi so loai trai cay
            System.out.println("So loai trai cay trong minh la : ");
            System.out.println(minh.size());

            //Kiem tra ton tai 1 loai trai cay
            System.out.println("Nhap loai trai cay muon kiem tra : ");
            String nameSearch = m.nextLine();
            if(minh.contains(nameSearch))
            {
                System.out.println("Co trai cay " +nameSearch+ " trong minh !!!");
            }
            else
            {
                System.out.println("Khong tim thay " +nameSearch+ "trong minh !");
            }

            //Xoa 1 loai trai cay
            System.out.println("Nhap loai trai cay muon xoa : ");
            String nameDelete = m.nextLine();
            if(minh.contains(nameDelete))
            {
                minh.remove(nameDelete);
                System.out.println("Xoa thanh cong !!!");
                System.out.println("Cac loai trai cay con lai : " +minh);
            }
            else
            {
                System.out.println("Xoa khong thanh cong !");
            }
            
            //Tao 1 list moi cung kieu du lieu voi hashSet
            List<String> phamvanminh = new ArrayList<>();
            phamvanminh.add("Chuoi");
            phamvanminh.add("Cam");
            phamvanminh.add("Buoi");
            phamvanminh.add("Dao");
            phamvanminh.add("Sau Rieng");

            //them vao ds dau
            minh.addAll(phamvanminh);
            System.out.println("Cac loai trai cay sau khi them vao la : ");
            Iterator<String> minh2501 = minh.iterator();
            while(minh2501.hasNext())
            {
                System.out.println(minh2501.next() + "\t");
            }

            //xoa cac phan tu cua list va hien thi lai hashSet
            minh.removeAll(phamvanminh);
            System.out.println("Cac loai trai cay trong minh sau khi xoa la : " +minh);
    }   
    }
}