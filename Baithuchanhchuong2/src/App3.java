import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        double year;
        String name;
        try (Scanner m = new Scanner(System.in)) {
            System.out.print("Nhap ten vao : ");
            name = m.nextLine();
            System.out.print("Nhap vao so nam : ");
            year = m.nextDouble();
        }
        double age=2022-year;
        if(age<16)
            System.out.println("Ban "+name+" o do tuoi vi thanh nien !!!");
        if(age>=16&&age<18)
            System.out.println("Ban "+name+" o do tuoi truong thanh !!!");
        if(age>=18)
            System.out.println("Ban "+name+" đa gia !!!");    
}
}