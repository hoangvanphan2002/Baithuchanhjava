import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        int firstNumber, secondNumber;
        System.out.println("Nhập số thứ nhất: ");
        try (Scanner sc = new Scanner(System.in)) {
            firstNumber = sc.nextInt();
            System.out.println("Nhập số thứ hai: ");
            secondNumber = sc.nextInt();
        }
        int minNumber = firstNumber;
        if(firstNumber > secondNumber)
          minNumber = secondNumber;   
        System.out.println("Số nhỏ nhất trong 2 số " + firstNumber + " và " +secondNumber + " là : " +minNumber);

    }
}