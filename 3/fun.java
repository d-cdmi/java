
import java.util.*;


public class fun {

    public static void printHell(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

   
    public static int factorial(int num){
        int ans=1 ;
        while (num > 0) {
            ans = num*ans;
            num-=1;
        }
        return ans;
    }
    public static int bioCoff(int n,int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n-r);

        return (fac_n)/(fac_r*fac_nmr);
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static int sum(int a,int b){
        return a + b ; 
    }

    public static boolean isPrime(int a){
       for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void Prime(int a){
        for (int i=3;i<a;i++) {
            int temp = i;
            if(isPrime(temp)==true) {
                System.out.println(i);
            }
        }
    }
    public static void B2D(int n){
        int ans = 0;
        
            for(int i=0;n!=0;i++){
                int LastDigit = n%10;     //101 ----> 1
                int Multi = LastDigit * (int)(Math.pow(2,i)) ;
                ans += Multi;
                n/=10;
            }
        

            System.out.println(ans);
    }
    public static void D2B(int Decimal){
        int bar = 0;         //7
        for(int i= 0;Decimal!=0;i++){
            
            int remd = Decimal%2;    //1
            bar =  bar + remd*(int)Math.pow(10, i);
            Decimal/=2;
        }
        System.out.println(bar);
        
        // System.out.println(bar);
    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println(Prime(10));
        // D2B(6);
        System.out.println("hello");
        // System.out.println(Math.pow(2,3));
    }

  
}

