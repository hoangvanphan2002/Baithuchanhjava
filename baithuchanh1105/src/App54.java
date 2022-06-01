import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            // thêm các phần tử vào hashSetInteger
            hashSetInteger.add(0);
            hashSetInteger.add(3);
            hashSetInteger.add(1);
            hashSetInteger.add(4);
            hashSetInteger.add(2);
            hashSetInteger.add(8);
            //hiển thị các phần tử trong hashSetInteger
            System.out.println("các phần tử trong hashSetInteger: ");
            System.out.println(hashSetInteger);
            System.out.println("Nhập phần tử cần thêm: ");
            number = scanner.nextInt();
        }
        // thêm một phần tử mới vào hashSetInteger yuwf bàn phím 
        // nếu phần tử đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if(!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("thêm thành công");
            System.out.println("các phần tử trong hashSetInteger sau khi thêm:");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("phần tử " + number + "dã tòn tại");
        }


 

       
    }
}
