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

    public static boolean ischeck(char  borad[][],int row,int col) {
        //vertical
        for (int i=row-1 ;i>=0;i--) {
            if(borad[i][col]=='Q') {
                return false;
            }
        }

        //diag left up
        for(int i=row-1 ,j=col-1;i>=0 &&j>=0;i--,j--) {
            if(borad[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0 && j<borad.length;i--,j++) {
            if (borad[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    
    public static void nQueen(char borad[][],int row) {
        if(row==borad.length) {
            printfbo(borad);
            return;
        }
        for (int j=0;j<borad.length;j++) {
            if(ischeck(borad, row, j)){
                
                borad[row][j] = 'Q';
                nQueen(borad, row+1);
                borad[row][j] = 'X';
            }
        }
    }
    public static void printfbo(char borad[][]) {
        System.out.println("------------------------------------------");

        for(int i=0;i<borad.length;i++) {
            for(int j=0;j<borad.length;j++) {
                System.out.print(borad[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // int a[]= new int[5];
        // backArr(a, 0, 1);
        // printarr(a);
        // subset("abc", "", 0);

        int n=5;
        char borad [][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                borad[i][j] = 'X';
            }
        }

        nQueen(borad, 0);
    }
}
