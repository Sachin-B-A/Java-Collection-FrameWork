// Same ArrayList , industries we use Vector more bcz thread safe but slower than arraylist(due to synchronization)

import java.util.*;

public class Myvector{
    public static void main(String[] args) {

        Vector <Integer> vc= new Vector<>(5);
        //Can intialize vector size or maynot also
        vc.add(10);
        vc.add(20);
        vc.add(30);
        vc.remove(2);
        System.out.println(vc.size());
        System.out.println(vc);
    }
}