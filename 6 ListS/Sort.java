import java.util.*;
public class Sort {
    
    // public static int storeWater (ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i=0;i<height.size();i++) {
    //         for(int j=i+1;j<height.size();j++) {
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-1;
    //             int currentWater = ht*width;
    //             maxWater = Math.max(maxWater, currentWater);
    //         }
    //     }
    //     return maxWater;
    // }


    //pointer approsh time is o(n)

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp =0;
        int rp = height.size()-1;

        while (lp<rp) {
            //cululate a water 
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currentWater = ht * width;
            maxWater = Math.max(maxWater, currentWater);
            
            //update pointer 
            if (height.get(lp) < height.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }
    
    public static boolean pairsum(ArrayList<Integer> list ,int target) {
        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean oppairum(ArrayList<Integer> list ,int target) {
        int lp = 0;
        int rp = list.size()-1;
        while (lp<rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true; //10<15
            } else if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } else if(list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }
    public static boolean pairsum2(ArrayList<Integer> list ,int target) {
        int n=list.size();
        int p = -1;
        for(int i=0;i<n;i++) {
            if(list.get(i) < list.get(i+1)) {
                p =i;
                break;
            }
        }

        int rp = p;
        int lp =p + 1 ;
        while (rp!=lp) {
            if(list.get(rp)+list.get(lp) == target) {
                return true;
            } 
            else if(list.get(rp)+list.get(lp) < target) {
                lp = (lp+1) %n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    
        // list.add(5);
        // list.add(48);
        // list.add(8);
        // list.add(7);
        // list.add(9);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
    
/////////////////////////////////////////////////////////////////////////////////
        
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();


        // for(int i=1;i<=5;i++) {
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // //print array list   for 2d array

        // for(int i=0;i<mainList.size();i++) {
        //     ArrayList<Integer> courrent = mainList.get(i);
        //     for(int j=0;j<courrent.size();j++) {
        //         System.out.print(courrent.get(j)+ " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
    
        // System.out.println(storeWater(height));
    

            // list.add(1);
            // list.add(2);
            // list.add(3);
            // list.add(4);
            // list.add(5);
            // list.add(6);
            // System.out.println(oppairum(list, 6));
        
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            System.out.println(pairsum2(list, 21));
    }
}
