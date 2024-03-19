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
    public static int Giray(int i,int j,int n,int m) {
        if(i==n-1 && j==m-1) {            //this code time comp is O(n^2 + m^2)
            return 1;
        }else if (i==n || j==m){
            return 0;
        }                                   // math formula and this math formula time comp  O(n+m)
        int w1 = Giray(i+1,j,n,m);          //  (n-1)(m-1)!
        int w2 = Giray(i,j+1,n,m);          //---------------------
        return w1+w2;                       //(n-1)! (m-1)!
    }




    public static boolean isself(int sudoku[][],int row ,int col,int digit) {
        //col
        for(int i=0;i<=8;i++) {
            if(sudoku[i][col]==digit) {
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++) {
            if(sudoku[row][j]==digit) {
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr;i<sr+3;i++) {
            for (int j = sc; j <sc+3; j++) {
                if(sudoku[i][j]==digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver (int sudoku[][],int row ,int col) {
        //base case 
        if(row==9 ) {
            return true;
        }
        //recursion
        int nexRow = row, nexCol = col+1;
        if (col+1==9) {
            nexRow = row+1;
            nexCol = 0;
        }
        if (sudoku[row][col]!=0) {
            return sudokuSolver(sudoku, nexRow, nexCol);
        }
        for(int digit=1;digit<=9;digit++) {
            if(isself(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nexRow, nexCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printf(int sudoku[][]) {
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int a[]= new int[5];
        // backArr(a, 0, 1);
        // printarr(a);
        // subset("abc", "", 0);

        // int n=5;
        // char borad [][] = new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         borad[i][j] = 'X';
        //     }
        // }
        // nQueen(borad, 0);

        // System.out.println(Giray(0,0,10,10));

        int sudoku[][] = {
        {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution is Exists");
            printf(sudoku); 
        }else{
            System.out.println("Solution Does not Exists");
        }

    }
}
