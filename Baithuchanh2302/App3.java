import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
      int n;
      Scanner sc=new Scanner(System.in);
      do{
        System.out.print("Nhập vào số nguyên n = ");
        n = sc.nextInt();
      }while(n<=0);
      if(n<2)
        System.out.println(n + " khong phai la so nguyen to");
      int count=0;
      for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0)
            count++;
      }
      if(count == 0){
        System.out.println(n + " la so nguyen to");
      }else 
        System.out.println(n + " khong la so nguyen to");
    }
}