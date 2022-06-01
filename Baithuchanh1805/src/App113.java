import java.util.TreeMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class App113 {
    public static void main(String[] args) {
        int sosv;
        Map<String,String> minh = new TreeMap<>();
        try (Scanner m = new Scanner(System.in)) {
            String masv , tensv ;
            //them thong tin sinh vien
            System.out.print("Nhap vao so sinh vien : ");
            sosv = Integer.parseInt(m.nextLine());
            for(int i = 1 ; i <= sosv ; i++)
            {
                System.out.println("Nhap thong tin sinh vien thu " + i );
                System.out.print("Nhap ma sinh vien : ");
                masv = m.nextLine();
                System.out.print("Nhap ten sinh vien : ");
                tensv = m.nextLine();
                System.out.print("Nhap lop cua sinh vien do : ");
                minh.put(masv, tensv);
            }
        
        //hien thi ds sinh vien 
        System.out.println("Danh sach cac sinh vien vua nhap : ");
        System.out.println("Ma sinh vien\tTen Sinh vien\tLop");
        Iterator<Map.Entry<String,String>> phamvanminh = minh.entrySet().iterator();
        while(phamvanminh.hasNext())
        {
            //tao 1 entry
            Map.Entry<String ,String > entry = phamvanminh.next();
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }

        //lay du lieu tu bang tren
        Set<Map.Entry<String,String>> minh2501 = minh.entrySet();
        System.out.println(minh2501);

        System.out.println("Nhap ma sinh vien muon tim : ");
        String masvSearch = m.nextLine();
        System.out.println("Ma sinh vien " + masvSearch + " : " +minh.get(masvSearch));
    }
    }
}