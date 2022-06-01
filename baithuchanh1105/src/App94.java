import java.util.LinkedHashMap;
import java.util.Set;
public class App94 {
    public static void main(String[] args) {
        //init LinkedHashMap
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        //add element to linkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "C++");
        linkedHashMap.put(3, "PHP");
        linkedHashMap.put(4, "Python");
        //show linkedHashMap before remove
        System.out.println("Before remove: ");
        show(linkedHashMap);
        //removw element
        linkedHashMap.remove(2);
        //show linkedHashMap after remove
        show(linkedHashMap);

    }
    //show HashMap
    private static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for(Integer key : keySet )
        {
            System.out.println(key +" "+ linkedHashMap.get(key));
        }
    }
}