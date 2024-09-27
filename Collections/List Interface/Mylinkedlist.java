
import java.util.*;
// its a two ended list;
//remove and return that element;

public class Mylinkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(20);
        l.add(45);
        l.addFirst(1);
        l.addLast(60);
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        // agriscc + first & last
    }
    /* Difference Between Arraylist and linkedlist:
     *  1.Implementation: Dynamic array and linkedlist use DLL
     *  2. SC : al less memory(linear storage) al ll (prev and next)
     *  3.TC: al O(1)(Direct through index) ll O(n)(traverse to index).
     *  4.ArrayList:
            Adding/removing an element at the end of the list is fast (O(1)).
            Adding/removing an element from the middle or beginning involves shifting elements to maintain order, making it slower (O(n)).
        5.LinkedList:
            Adding/removing elements at the beginning or middle is fast (O(1)) as it just requires adjusting the pointers.
            Inserting at the end of the list is also fast (O(1)) when the list is doubly linked.
    */ 
}