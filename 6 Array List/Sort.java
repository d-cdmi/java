import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(5);
        list.add(48);
        list.add(8);
        list.add(7);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    
    }
}
