import java.util.Scanner;
public class App8 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      double n=1,max=0;  
      System.out.println("Nhap n: ");
      while(n!=0){
        n = sc.nextDouble();
        if(n%5==0)
          if(max<n)
           max=n;
      }
      System.out.println("So lon nhat trong cac so chia het cho 5 vua nhap la: " + max);
    }
}