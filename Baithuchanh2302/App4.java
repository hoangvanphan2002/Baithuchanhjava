import java.util.Scanner;
public class App4 {
    public static int PrimeNumber(int n){
      if(n<2)
        return 0;
      for(int i=2;i<n;i++){
        if(n%i==0)
           return 0;
      }
      return 1;
    }
    public static void main(String[] args) throws Exception {
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap n: ");
       n = sc.nextInt();
       System.out.println("Cac so nguyen to nho hon " + n + " la: ");
       for(int i=1;i<=n;i++){
        if(PrimeNumber(i)==1)
          System.out.println(i);
       }
    }
  }