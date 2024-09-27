
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CoustomEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(40);
        al.add(20);
        al.add(30);
        al.add(50);
        al.add(70);

        System.out.println(al);
        Collections.sort(al, (num1, num2) -> num2 - num1);// Called lamda function where num2-num1 is a negative value hence change or swap.
        System.out.println(al);
    }

    public static Comparator<Integer> getComparator() {
        return new Comparator<Integer>() {
                // Just think in perspective of two Numbers
                @Override
                public int compare(Integer o1, Integer o2){
                    if(o1 < o2){
                        return 1;
                    }else if (o2 < o1){
                        return -1;
                    }
                    return 0;// for Equality
            }
        };
    }
}