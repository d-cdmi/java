import java.util.LinkedList;
public class LinkedListBuli {

    

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(1);
        System.out.println(ll);
    
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }    
}
