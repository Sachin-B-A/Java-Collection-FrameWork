
// import static java.util.Arrays.sort;
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
import java.util.*;


public class CommonFun{
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        Collections.sort(al);
        Collections.max(al);//min
        Collections.reverse(al);
        Collections.frequency(al, 5);
        System.out.println(Collections.binarySearch(al, 20));
        Arrays.sort(al);
        Math.pow(2,3);
    }
}
