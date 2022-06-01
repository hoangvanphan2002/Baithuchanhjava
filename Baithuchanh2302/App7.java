import java.util.Scanner;
public class App7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n=1,max=0;  
        System.out.println("Nhap n: ");
        while(n!=0){
          n = sc.nextDouble();
          if(max<n)
            max=n;
        }
        System.out.println("So lon nhat trong cac so vua nhap la: " + max);
      }
}