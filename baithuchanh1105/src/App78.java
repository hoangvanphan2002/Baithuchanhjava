import java.util.HashMap;
import java.util.TreeMap;
public class App78 {
    public static void main(String[] args) {
        //khai báo 1 hashmap tên hashmap2
        //mỗi phần tử trong hashmap2 bao gồm 2 phần tử
        //key (String ) và value (String)
        //có kích thước khởi tạo = 10
        var hashmap2 = new HashMap<String, String>(10);

        //khai báo 1 hashmap có kích thước khởi tạo = 4
        //và yếu tố tải = 0,75f (mặc định)
        //chi tiết về kích thước khởi tạo và yếu tố tải
        //các bạn xem lại bài HashSet
        HashMap<Double,Double> hashmap3 = new HashMap<>(4,0.75f);

        //khai báo 1 hashmap ssuowjc tạo thành từ 1 Collection khác
        HashMap<Float,Integer> hashmap4 = new HashMap<>(new TreeMap<>());
    }
}