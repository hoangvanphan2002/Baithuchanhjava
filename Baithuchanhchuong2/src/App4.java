import java.util.Scanner;
public class App4 {
    public static void main(String[] args) {
        int month;
        try (Scanner m = new Scanner(System.in)) {
            System.out.println("Nhap vao 1 so : ");
            month = m.nextInt();
        }
        switch(month){
          case 1: 
            System.out.println("Thang 1");
          case 2: 
            System.out.println("Thang 2");
          case 3: 
            System.out.println("Thang 3");
          case 4: 
            System.out.println("Thang 4");
          case 5: 
            System.out.println("Thang 5");
          case 6: 
            System.out.println("Thang 6");
          case 7: 
            System.out.println("Thang 7");
          case 8: 
            System.out.println("Thang 8");
          case 9: 
            System.out.println("Thang 9");
          case 10: 
            System.out.println("Thang 10");
          case 11: 
            System.out.println("Thang 11");
          case 12: 
            System.out.println("Thang 12");
          break;
          default:System.out.println("So thang sai !!!");
        }
}
}