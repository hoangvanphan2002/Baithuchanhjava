import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class App108 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1,9d );
        treeMap.put(4,10.1d );
        treeMap.put(2,7.2d );
        treeMap.put(8,20.28d );

        System.out.println("Các phần tử có trong TreeMap là : ");
        Set<Map.Entry<Integer,Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        //thay thế value của entry có khóa là 4
        //thành 20.11d
        treeMap.replace(2, 7.2d, 7.7d);

        System.out.println("Các phần tử có trong treeMap sau khi thay thế : ");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
}