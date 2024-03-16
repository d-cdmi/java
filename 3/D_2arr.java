import java.util.*;
public class D_2arr {
    
    public static void getarry(int key) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i=0;i<3;i++) {
            for (int j= 0;j<3;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
    
        // print 
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                // System.out.print(" ["+i+"]["+j+"]= "+arr[i][j]);
                if(key==arr[i][j]){
                    System.out.println("Key Find its");
                }
            }
            System.out.println();
        }
    }

    public static void printSpiral(int matrix[][]) {
        int StartCol = 0;
        int StartRow = 0;
        int endCol = matrix[0].length-1;
        int endRow = matrix.length-1;

        while (StartRow <= endRow && StartCol<= endRow) {

            for (int j=StartCol;j<=endCol;j++) {
                System.out.print(matrix[StartCol][j]+" ");
            }
            
            for (int i = StartRow+1 ; i<=endRow;i++) {
                System.out.print(matrix[i][endCol]+" ");
            }            
            
            for(int j=endCol-1;j>=StartCol;j--) {
                if(StartCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");    
            }
            for (int i=endRow-1;i>=StartRow+1;i--){
                if(StartRow==endRow){
                    break;
                }
                System.out.print(matrix[i][StartCol]+" ");    
            }
            StartCol++;
            StartRow++;
            endCol--;
            endRow--;
        }

    }
    public static boolean staircaseSerach (int matrix[][],int key) {
        int row =0, col =  matrix[0].length-1;
        while (row < matrix.length && col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("key Found");
                return true;
            } else if(key<matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;

    }
    
    
    
    
    
    public static void main(String[] args) {
        // getarry(3);
        // int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // printSpiral(arr);
        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},      
                        {32,33,39,50}            
                                    } ;
        int key = 3;
        staircaseSerach(arr, key);
    }
}
