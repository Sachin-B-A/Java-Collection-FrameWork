
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);

        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}