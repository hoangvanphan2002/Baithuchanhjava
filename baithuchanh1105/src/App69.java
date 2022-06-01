import java.util.TreeSet;

import java.util.Scanner;

public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger =new TreeSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            //Thêm các phần tử vào trong TreeSetInteger
            treeSetInteger.add(0);
            treeSetInteger.add(3);
            treeSetInteger.add(1);
            treeSetInteger.add(4);
            treeSetInteger.add(2);
            treeSetInteger.add(6);

            //Hiện thị các phần tử trong TreeSetInteger
            System.out.println("Các phần tử trong TreeSetInteger : ");
            System.out.println(treeSetInteger);
            System.out.println("Nhập phần tử từ bàn phím : ");
            number = sc.nextInt();
        }
        
        //Thêm 1 phần tử mới vào TreeSetInteger nhập vào từ bàn phím
        //nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if(!treeSetInteger.contains(number))
        {
            treeSetInteger.add(number);
            System.out.println("Thêm thành công !!! ");
            System.out.println("Các phần tử trong TreeSetInteger sau khi thêm : ");
            System.out.println(treeSetInteger);
        }
        else
        {
            System.out.println("Phần tử " + number + " đã tồn tại");
        }
    }
}          