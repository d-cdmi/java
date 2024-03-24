import java.time.*;

public class arry {

    // private static void arr(int arr[]){
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = arr[i] + 1;
    //     }
    // }

    // public static int leni(int number[],int key) {
    //     for(int i = 0; i < number.length; i++){
    //         if(number[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int getMin(int arr[]){
    //     int largest = Integer.MIN_VALUE;
    //     int minimum = Integer.MAX_VALUE;
    //     for(int i = 0;i<arr.length;i++){
    //         if(arr[i]>largest){
    //             largest = arr[i];
    //         }

    //         if(arr[i]<largest){
    //             minimum = arr[i];
    //         }
    //     }
    //     System.out.println(minimum);
    //     return largest ;
    // }

    // public static int banrySearch(int number[], int key){ // 2,3,4,5,6,7,8,9    8
    //     int start = 0, end = number.length-1;
    //     while(start<=end){          // 0<7

    //         int mid = (start+end) / 2;  // mid = 3<8       5+7/2 =6[8]
    //         if (number[mid]==key){
    //             return mid;
    //         }
    //         else if(number[mid]<key){       //true  7<8
    //             start = mid +1;             //start = 5
    //         }else{
    //             end = mid -1;
    //         }
    //     }
    //     return -1;
    // }

    // public static void reverse(int number[]){
    //     int start = 0 , end = number.length-1;

    //     for (;start<end;start++,end--){
    //         int temp = number[start];
    //         number[start] = number[end];
    //         number[end] = temp;
    //     }
        
    // }

    // public static void pairs(int[] numbers){
    //     int tp = 0;
    //     for (int i = 0;i<numbers.length;i++){
    //         for(int j = i+1;j<numbers.length;j++, tp++){
    //             System.out.println("("+numbers[i]+" , "+numbers[j]+")\n");
    //         }
    //     }
    //     System.out.println(tp);
    // }

    // public static void subarray(int num[]){
    //     int sum=0 ;
    //     int max = Integer.MIN_VALUE;
    //     int prefix[] = new int[num.length];

    //     prefix[0] = num[0];
    //     for (int i = 1;i<num.length;i++) {
    //         prefix[i] = prefix[i-1] + num[i-1];
    //     }
    //     for(int i=0;i<num.length;i++){
    //         for(int j=i;j<num.length;j++){

    //             sum = i == 0 ? prefix[j] : prefix[j] + num[i-1];
    //             // for(int k = i;k<=j;k++){
    //             //     System.out.print(num[k]+" ");
                    
    //             //     sum+=num[k]; 
    //             // }
    //             // System.out.println(sum);
    //             if(max<sum){
    //                 max = sum;
    //             }
    //             // System.out.println();
    //             sum=0;
    //         }
    //         // System.out.println();

    //     }
    //     System.out.println("Max value is " + max);
    // }

    // public static void kadaneAlgorithm(int number[]){
    //     int max = Integer.MIN_VALUE;
    //     int cs =0;
    //     for (int i = 0; i < number.length; i++) {
    //         cs+=number[i];
    //         if(cs<0){
    //             cs =0;
    //         }
    //         if(max<cs){
    //             max = cs;
    //         }
    //         max = Math.max(max,cs); 
    //     }
    //     System.out.println(max);
    // }

    // public static void trappedRaiwater(int a[]){
    //     int n = a.length;
    //     //max for letf
    //     int leftmax[] = new int[n];
    //     leftmax[0] = a[0];//4,4,4, 6   ,6,  6,6

    //     //serach for right max
    //     for (int i = 1; i < n; i++){
    //         leftmax[i] = Math.max(a[i],leftmax[i-1]);  //2 4
    //     }
    //                                                         //4,2,0,6,3,  2,5
    //     int rightmax[] = new int[n];//last thi start thay chhe
    //     rightmax[n-1] = a[n-1];// 6 6 6  6   5   5 5

    //     for (int i =n -2; i >= 0; i--){
    //         rightmax[i] = Math.max(a[i],rightmax[i+1]);
    //     }

    //     int ans = 0;
    //     for(int i=0;i<n;i++){
    //         int temp = Math.min(leftmax[i],rightmax[i]);//
    //         ans+=temp-a[i];   // 0+2+4+0+2+3   =  11
    //     }
    //     System.out.println(ans);
    // }



    public static int Buysell(int arr[] ) {
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(buyPrice < arr[i]) {
                int profit = arr[i]-buyPrice  ;
                MaxProfit = Math.max(MaxProfit,profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return MaxProfit;
    }




    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // arr(arr);
        //print(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // } 
        // int arr[] = {20,45,35,35,65,35,75,32};
        // int key = 65;
        // int ans = leni(arr, key);
        // System.out.println(ans);
    
    
        // int arr[] = {20,45,35,35,65,35};
        // System.out.println(getMin(arr));
    
        // int arr[] = {3,6,7,8,10,46,59};
        // System.out.println(banrySearch(arr, 11));    
        // reverse(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    
        // pairs(arr);
        
        // int a[] = {2,4,6,8,10};
        // subarray(a);

        // int a[] = {-2,-3,4,-1,-2,5,-3,1};
        // kadaneAlgorithm(a);

        // int a[] = {4,2,0,6,3,2,5};
        // trappedRaiwater(a);

        int a [] = {7,1,5,3,6,4};
        System.out.println(Buysell(a));

            
    

    
    
    
    
    
    
    
    }


}
