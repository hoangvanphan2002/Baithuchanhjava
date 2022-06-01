import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
      int n, count = 0;
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("Nhập vào 1 số nguyên dương : ");
        n = sc.nextInt();
      }while(n<=0);

      while (n > 0) {
          n /= 10;
          count++;
      }
      System.out.println("Số các chữ số = " + count);
  }
}