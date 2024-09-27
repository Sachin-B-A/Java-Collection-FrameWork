import java.util.*;

public class MyHashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        //Key, value pair
        // Same but add won't work
        // Does not necessary to be in sorted order (accprding to key)
        mp.put(1, "Sachin");
        mp.put(2, "Swaroop");
        mp.get(2);
        mp.get(3);// which is not present return null
        mp.remove(2);
        System.out.println(mp);
        // If order doesn't matter use this, Since Works in constant time
    }
}
