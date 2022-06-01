import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        //Khai báo 1 LinkedList có tên là abc
        //có kiểu là String
        LinkedList<String> abc = new LinkedList<>();
        //Add object to list
        abc.add("java");
        abc.add("C++");
        abc.add("PHP");
        abc.add("Java");

        System.out.print("Ví dụ sử dụng phương thức addAll()");
        System.out.print("----------------------------------");

        //Thêm các phần tử của List vào ListA
        LinkedList<String> ListA = new LinkedList<>();
        ListA.addAll(abc);
        System.out.print("ListA : ");
        showList(ListA);

        System.out.println("\nVí dụ sử dụng phương thức retainAll() ");
        System.out.println("----------------------------------------");
        //Khởi tạo ListB
        LinkedList<String> ListB = new LinkedList<>();
        ListB.add("Java");
        //Xóa những phần tử không thuộc ListB khỏi listA
        ListA.retainAll(ListB);
        System.out.print("ListA: ");
        showList(ListA);
        
        System.out.println("\n Sử dụng phương thức removeAll()");
        System.out.println("-----------------------------------");
        //Xóa những phần tử không thuộc ListB khỏi abc
        abc.removeAll(ListB);
        System.out.print("ListA: ");
        showList(abc);
    }

    public static void showList(LinkedList<String> abc)
    {
        // showw list through for-each
        for(String obj : abc )
        {
            System.out.println("\t" + obj + " , ");
        }
        System.out.println();
    }
}