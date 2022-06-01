import java.util.Scanner;
public class App6 {
  public static int PerfectNumber (int n){
    int sum=0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0) 
        sum+=i;
    }
    if(sum==n){
      return 1;
    }
    return 0;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Nhap n: ");
    n = sc.nextInt();
    System.out.println("Tat ca cac so hoan thien nho hon "+ n + " la");
    for(int i=1;i<=n;i++){
      if(PerfectNumber(i)==1)
        System.out.println(i);
    }
  }
}