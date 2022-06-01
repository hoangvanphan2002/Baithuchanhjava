import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        String chuoi;
      char kyTu;
      int count = 0;
      try (Scanner m = new Scanner(System.in)) {
        do {
            System.out.println("Nhap vao mot chuoi bat ky : ");
            chuoi = m.nextLine();
          } while (chuoi.length() > 80);
            
          System.out.println("Nhap vao ky tu can dem so lan xuat hien : ");
          kyTu = m.next().charAt(0);
    }
      for (int i = 0; i < chuoi.length(); i++) {
        if (kyTu == chuoi.charAt(i)) {
            count++;
        }
    }
        
      System.out.println("So lan xuat hien cua ky tu " + kyTu +
        " trong chuoi " + chuoi + " = " + count);
    }
}