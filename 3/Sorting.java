public class Sorting {
    
    public static void printarr(int a[]){
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    public static void mergeSort(int arr[],int si ,int ei){
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merger(arr,si,mid,ei);
    }
    public static void merger(int arr[],int si,int mid ,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid )
    	{
                temp[k++]=arr[i++];
            
	    }
        while (j<=ei) {
            
            
                temp[k++]=arr[j++];
            
        }
        for(k=0, i=si;k<temp.length;i++,k++){
            arr[i] =temp[k];
        }
    }




    public static void quritSort(int arr[],int si,int ei){
        int pos;
        if(si<=ei)
        {
            pos = split(arr,si,ei);
            quritSort(arr,si,pos-1);
            quritSort(arr,pos+1,ei);
        }
    }
    public static int split(int a[],int si,int ei){
        int i = si-1;    
        int pivot = a[ei];
        for (int j=si;j<ei;j++) {
            if(a[j]<=pivot){
                i++;
                int temp = a[j];
                a[j] =  a[i];
                a[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        a[ei]= a[i];
        a[i] = temp;
        return i;
    }
    public static int Serach(int a[],int tar ,int si,int ei ) {
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        if(a[mid] == tar){
            return mid;
        }
        if(a[si]<=a[mid] ){
            if(a[si]<=tar && tar<=a[mid]){
                return Serach(a, tar, si, mid-1);
            }else{
                return Serach(a, tar, mid+1, ei);
            }
    }
        else{
            if(a[mid]<=tar && tar<= a[ei]){
                return Serach(a, tar, mid+1, ei);
            }else{
                return Serach(a, tar, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        // int a[]= {-21,2,3,5,6,5};
        // mergeSort(a,0,a.length-1);
        // printarr(a);
    
        // quritSort(a, 0, a.length-1);
        // printarr(a);

        int a[] = {4,5,6,7,0,1,2};

        System.out.println(Serach(a, 0, 0, a.length-1));
    }
}
