
import java.util.*;

public class MyPriorityQue {
    public static void main(String[] args) {
        // Stores element according to priority
        // Whenever ask for peak it shows up smallest element

        PriorityQueue<Integer> queue = new PriorityQueue<>(getComparator());
        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(5);
        System.out.println(queue);//Random Order
        // System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
        System.out.println(queue);
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

