import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class App95 {
    public static void main(String[] args) {
       //khai báo 1 TreeMap trên treemap1
       //mỗi phần tử trong treemap1 bao gồm 2 thành phần
       //key(String) và value (double)
       TreeMap<String,Double> TreeMap1 = new TreeMap<>();

       //khai báo 1 treemap được tạo thành từ 1 Map
       Map<Float, Integer> map = new HashMap<>();
       TreeMap<Float,Integer> TreeMap2 = new TreeMap<>(map);
    }
}