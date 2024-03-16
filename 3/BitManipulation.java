import javax.print.DocFlavor.READER;

public class BitManipulation {
    public static void oddevern(int n) {
        int bitmax = 1;
        if((n & bitmax) == 0) {
            System.out.println("Evern Number");
        } else {
            System.out.println("odd number");
        }
    }
    
    public static int getIthnumber(int n,int index) {
        int bitmax = 1<<index;
        if((n&bitmax)==0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthnumber(int n,int i) {
        int bitmax = 1<<i;
        return n | bitmax;
    }

    public static int clearIthnumber(int n,int i) {
        int bitmax = ~(1<<i);
        return n & bitmax;
    }
    public static int updataIth(int n, int i ,int newbit) {
        if (newbit == 0) {
            return clearIthnumber(n, i);
        }else {
            return setIthnumber(n, i);
        }

        // n = clearIthnumber(n, i);
        // int bitmax = newbit <<i;
        // return n |bitmax;
    }
    public static int clearbit(int n,int i) {
        int bitmax = (~0)<<i;
        return n & bitmax;
    }
    public static int clearIthbit(int n,int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmax = a |b;
        return n & bitmax;
    }
    
    public static boolean ispoweroftwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static int coutsetbit(int n ) {
        int cout=0;
        while ( n>0) {
            if ((n&1)!=0) {
                cout++;
            }
            n = n>>1;
        }
        return cout;
    }
    public static int Exponentiation (int n,int a) {
        int ans =1;
        while (n>0) {
            if ((n&1)!=0) {
                ans =ans*a;
            }
            a =a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(4&6);
        // System.out.println(4|6);
        // System.out.println(5^6);
        // System.out.println(~5);
        // System.out.println(~0);
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        // oddevern(2);
        // oddevern(5);
        
        // System.out.println(getIthnumber(10, 3));
        // System.out.println(setIthnumber(10, 2));
        // System.out.println(clearIthnumber(10, 1));
        // System.out.println(updataIth(10, 2,1));
        // System.out.println(clearbit(15, 2));
        // System.out.println(clearIthbit(10, 2,4));
        // System.out.println(coutsetbit(10));
        System.out.println(Exponentiation(3,5));




    }
}
