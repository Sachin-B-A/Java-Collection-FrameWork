import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        // Always Stores Key in the form sorted order
        // But 0(log N)
        // Map only stores unique keys
        
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1, "Hello");
        tm.put(3, "World");
        tm.put(5, "Java");
        // System.out.println(tm);
        // tm.remove(1);
        // System.out.println(tm);
        System.out.println(tm.ceilingKey(2));// first key less than given key
        Set<Integer> st = tm.keySet();
        
        for (Integer i : st) {
            System.out.println(i + " " + tm.get(i));
        }
    }
}