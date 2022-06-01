import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        float num1,num2;
        try (Scanner m = new Scanner(System.in)) {
            System.out.println("Nhap vao hai so bat ky : ");
            num1 = m.nextFloat();
            num2 = m.nextFloat();
        }
        System.out.printf( "\n%f + %f = %f",num1,num2,num1+num2);
        System.out.printf( "\n%f - %f = %f",num1,num2,num1-num2);
        System.out.printf( "\n%f * %f = %f",num1,num2,num1*num2);
        System.out.printf( "\n%f / %f = %f\n",num1,num2,num1/num2);
        if(num1>num2) 
                System.out.println(num1 +" lon hon "+ num2);
        else if(num1<num2) 
                System.out.println(num1 +" nho hon "+ num2);
        else 
                System.out.println(num1 +" bang "+ num2);
}
}