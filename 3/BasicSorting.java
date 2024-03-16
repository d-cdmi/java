/**
 * BasicSorting
 */
public class BasicSorting {

    public static void bubbleSorting(int arr[]){
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) { 
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
        }
    }
    public static void PrintArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            System.out.println();
        }
    }


    // public static void SelectionSort(int arr[]) {
    //     for(int i=0; i<arr.length-1; i++) {
    //         int min =i;
    //         for(int j =i+1;j<arr.length; j++) {
    //             if(arr[min] >arr[j]){
    //                 min = j;
    //             }
    //         }
    //         int temp = arr[min];
    //         arr[min] = arr[i];
    //         arr[i] = temp;
    //     }
    // }

    // public static void InsertionSort(int arr[]) {
    //     for (int i = 1; i < arr.length; i++){
    //         int temp = arr[i];
    //         int j = i-1;
    //         while(j >= 0 && arr[j]>temp){
    //            arr[j+1] = arr[j];
    //            j--;
    //         }
    //         arr[j+1] = temp;   
    //     }        
    // }
    
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
             largest = Math.max(largest,arr[i]);
        }

        int cout[] = new int[largest+1];
        for(int i=0;i<arr.length;i++) {
            cout[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<cout.length;i++) {
            while (cout[i]>0) {
                arr[j] = i;
                cout[i]--;
                j++;                
            }
        }

    }


    public static void main(String[] args) {
        int arr[] ={4,3,25,7,41};
        // bubbleSorting(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        

        countingSort(arr);
        PrintArray(arr);

    }
}