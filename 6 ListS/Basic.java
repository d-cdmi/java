import java.util.*;
public class Basic {

    public static void swap (ArrayList<Integer> list ,int idx1,int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // for(int i=1;i<=5;i++)
        // list.add(i);   //o(1)           //add elemets

        // System.out.println(list);

        // System.out.println(list.get(2)); //get index value

        // list.remove(2);          //remove index value
        // list.set(2, 10); 

        // System.out.println(list.contains(1));    //return true and false hoy to true 
        // System.out.println(list);

    /////////////////////////////////////

        // for(int i=1;i<6;i++) {
        //     list.add(i);
        // }
        // list.add(15);
        // System.out.println(list.size());

        // for(int i=0;i<list.size();i++) {
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        // for(int i=list.size()-1;i>=0;i--) {
        //     System.out.print(list.get(i)+" ");
        // }
    
        // int max = Integer.MIN_VALUE;   
        // for(int i=0;i<list.size();i++) {
        //     // if(max<list.get(i)) {
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // System.out.println(list);
        // swap(list, 0, 2);
        // System.out.println(list);
    
    }
}