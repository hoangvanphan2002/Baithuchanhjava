import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        int number;
        try (Scanner m = new Scanner(System.in)) {
            do{
              System.out.println("Nhap so nguyen : ");
              number = m.nextInt();
            }while (number<=0);
        }
        int giaithua=1;
        if(number==1||number==0)
          System.out.println(number+"!= "+giaithua);
        else {
          for(int i=2;i<=number;i++)
            giaithua*=i;
        }
        System.out.println(number+"!= "+giaithua);
    }
}