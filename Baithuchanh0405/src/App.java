import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        //dùng for thường

        ArrayList<String> abc = new ArrayList<>();

        //Thêm các phần tử sử dụng phương thức add
        abc.add("JAVA");
        abc.add("PHP");
        abc.add("C#");
        abc.add("C++");

        //Thay thế phần tử bằng set
        abc.set(1,"RUBY");
        
        //Chèn phần tử tử bằng void add
        abc.add(3,"PYTHON");

        //Loại bỏ phần tử bằng remove
        abc.remove(3);

        //Hiện thị giá trị ra màn hình
        System.out.print("Các giá trị của ArrayList là : ");
        for(int i = 0 ; i < abc.size() ; i++)
            {
                System.out.print(abc.get(i) + "\t");
            }
    }
}