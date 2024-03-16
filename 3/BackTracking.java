public class BackTracking {
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void backArr(int a[],int i,int values) {
        if(i==a.length){
            printarr(a);
            return;
        }
        a[i] = values;
        backArr(a, i+1, values+1);
        a[i] = a[i] - 2;

    }
    public static void subset(String a,String n,int i) {
        if(i==a.length()){
            System.out.println(n);
            return;
        }

        subset(a, n+a.charAt(i), i+1);
        subset(a, n, i+1);
    }
    
    public static void main(String[] args) {
        // int a[]= new int[5];
        // backArr(a, 0, 1);
        // printarr(a);
        subset("abc", "", 0);
    }
}
