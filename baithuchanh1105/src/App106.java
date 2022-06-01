import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class App106 {
    public static void main(String[] args) {
        //khai báo 1 treemap có tên là treemap
        //kiểu dữ liệu của key là Integer
        //và value là Character
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        //thêm value vào trong treeMap với key tương ứng
        //sử dụng phương thức put()
        // và đổi số thứ hai là value có kiểu là character
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');

        //tạo 1 Set có tên là SetTreeMap
        //chứa toàn bộ các entry ( vừa key vừa value )
        // của treeMap
        Set<Map.Entry<Integer,Character>> setTreeMap = treeMap.entrySet();

        //các entry trong setTreeMap sẽ đc sắp xếp tăng dần theo khóa
        System.out.println("Các entry có trong setTreeMap : ");
        System.out.println(setTreeMap);
    }
}