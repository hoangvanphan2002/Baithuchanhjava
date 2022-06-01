public import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App86 {
    public static void main(String[] args) {
        
        HashMap<String,String> hashmap = new HashMap<>();

        //thêm value vào trong hashmap với key tương ứng
        //sử dụng phương thức put()
        //đối với sô thứ nhất trong put là key có kieur String
        //và đổi số thứ hai là value có kiểu String
        hashmap.put("CSLT", "Cơ Sơ Lập Trình");
        hashmap.put("C++", "C++");
        hashmap.put("C#", "C Sharp");
        hashmap.put("PHP", "PHP");
        hashmap.put("Java", "Java");

        //tạo 1 Set có tên là SetHashMap
        //chứa toàn bộ các entry ( vừa key vừa value )
        //của hashMap
        Set<Map.Entry<String,String>> SetHashMap = hashmap.entrySet();

        System.out.println("Các entry có trong sethashmap : ");
        System.out.println(SetHashMap);

    }
} {
    
}
