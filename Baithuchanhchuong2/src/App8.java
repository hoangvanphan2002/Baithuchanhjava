import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int number;
        try (Scanner m = new Scanner(System.in)) {
            do{
              System.out.println("Nhap so nguyen : ");
              number = m.nextInt();
            }while (number<=0); 
            int a[] = new int[number];
            float sum=0;
            for(int i=0;i<number;i++){
              System.out.println("a["+i+"]= ");
              a[i] = m.nextInt();
              sum+=a[i];
            }
            float average=sum/number;
            System.out.println("Trung binh cong = " + average);
        }
    }
}