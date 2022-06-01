import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class App111 {
    public static void main(String[] args) {
        //khai bao mang luu tru thong tin sinh vien pham van minh
        String tensv,thongtin = null;
        String arrThongTin[];
        Double diemsv;

        //luu tru ds sinh vien
        LinkedList<String> dsSV = new LinkedList<>();
        //luu tru ds sinh vien thi lai
        LinkedList<String> svThiLai = new LinkedList<>();
        //luu tru ds sinh vien co diem cao nhat
        LinkedList<String> svDiemCao = new LinkedList<>();
        //luu tru ds sinh vien can tim
        LinkedList<String> svfind = new LinkedList<>();

        try (Scanner m = new Scanner(System.in)) {
            //them ds sinh vien
            do
            {
                System.out.println("Nhap vao ten sinh vien : ");
                tensv = m.nextLine();
                if(!tensv.isEmpty())
                {
                    System.out.println("Nhap vao diem cua sinh vien : ");
                    diemsv = Double.parseDouble(m.nextLine());
                    thongtin = tensv + "\t" + diemsv;
                    dsSV.add(thongtin);
                }
            }
            //khi chuoi khac rong thi con nhap
            while(!tensv.isEmpty());

            //hien thi ds sinh vien
            System.out.print("So sinh vien trong danh sach = " + (dsSV.size()));
            System.out.print("Thong tin cua cac sinh vien vua nhap : ");
            System.out.print("Ten sinh vien\tDiem ");
            Iterator<String> iterator = dsSV.iterator();
            while(iterator.hasNext())
            {
                System.out.println(iterator.next());
            }

            //diem so sinh vien phai thi lai
            for(int i = 0 ; i < dsSV.size() ; i++)
            {
                String sv = dsSV.get(i);
                arrThongTin = sv.split("\t");
                double point = Double.parseDouble(arrThongTin[1]);
                //point <= 5 thi thi lai
                if(point <= 5)
                {
                    svThiLai.add(sv);
                }
            }
            if(svThiLai.isEmpty())
            {
                System.out.println("Khong co danh sach sinh vien phao thi lai !!!");
            }
            else
            {
                System.out.println("So sinh vien phai thi lai = " +(svThiLai.size()));
                System.out.println("Thong tin cua cac sinh vien phai thi lai : ");
                System.out.println("Ten sinh vien\tDiem ");
                iterator = svThiLai.iterator();
                while(iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }
            }

            //tim ds sv diem cao nhat
            double max = 0;
            int i = 0;
            while(i < dsSV.size())
            {
                arrThongTin = dsSV.get(i).split("\t");
                if(Double.parseDouble(arrThongTin[1]) >= max)
                {
                    max = Double.parseDouble(arrThongTin[1]);
                }
                i++;
            }
            i = 0;
            while(i < dsSV.size())
            {
                arrThongTin = dsSV.get(i).split("\t");
                if(Double.parseDouble(arrThongTin[1]) == max)
                {
                    svDiemCao.add(dsSV.get(i));
                }
                i++;
            }

            System.out.println("Thong tin cua cac sinh vien co diem cao nhat : ");
            System.out.println("Ten sinh vien\tDiem");
            iterator = svDiemCao.iterator();
            while (iterator.hasNext()) 
            {
                System.out.println(iterator.next());    
            }

            //tim kiem theo ten sinh vien
            System.out.println("Nhap ten sinh vien can tim : ");
            String nameSearch = m.nextLine();
            i = 0;
            while (i < dsSV.size()) 
            {
                arrThongTin = dsSV.get(i).split("\t");
                tensv = arrThongTin[0];
                if(nameSearch.equalsIgnoreCase(tensv))
                {
                    svfind.add(dsSV.get(i));
                }   
                i++;  
            }

            //in ra man hinh thong tin sinh vien vua tim
            System.out.println("Thong tin cua cac sinh vien ten la " +nameSearch+ " : ");
            System.out.println("Ten sinh vien \t Diem");
            iterator = svfind.iterator();
            while (iterator.hasNext()) 
            {
                System.out.println(iterator.next());    
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}