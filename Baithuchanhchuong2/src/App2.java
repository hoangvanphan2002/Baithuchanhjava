import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        double num1;
        try (Scanner m = new Scanner(System.in)) {
            System.out.println("Nhap vao so bat ky : ");
            num1 = m.nextDouble();
        }
        if(num1%2==0) System.out.println(num1 +" là số chẵn ");
        else System.out.println(num1 +" là số lẻ ");    
}
}