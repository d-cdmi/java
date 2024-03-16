public class A10to1 {
    // public static void printtDec(int n) {
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.println(n);
    //     printtDec(n-1);
    // }
    // public static void printtInc(int n) {
    //     // System.out.println(n);
    //     if (n==1) {
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printtInc(n-1);
    //     System.out.print(n+" ");
    // }
    public static int fac(int n) {
        if(n==0){
            return 1;
        }
        int fac1 = fac(n-1); 
        return n*fac(n-1);
        // return ans;
    }
    public static int sum(int n){
        if(n==0){
            return n;
        }
        return n+sum(n-1);
    }

    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static boolean sort(int a[],int i){
        if(a[i]==a.length-1 )
        {
            return true;   
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return sort(a , i+1);        
    }
    // public static int fistOcc(int a[],int key,int i){
    //     if(a[i]==key){
    //         return i;
    //     }
    //     if(a[i]==a.length){
    //         return -1;
    //     }
    //     return fistOcc(a,key,i+1);
    // }
    public static int latOcc(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        int isFond = latOcc(a, key, i+1);
        if((isFond==-1) && (a[i]==key)){
            return i;
        }
        return isFond;
    }
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        return a*power(a,n-1);
    }
    public static int optimpower(int a,int n){     //o(long ) time complexity
        if(n==0){
            return 1;
        }
        int halfpower = optimpower(a, n/2);
        if(n%2==1){
            return halfpower*halfpower * a;
        }
        return halfpower*halfpower;
    }
    public static int tillngProb(int n) {
        if(n==0 || n==1){
            return 1; 
        }
        return tillngProb(n-1) + tillngProb(n-2);
         
    }
    public static void removetoDublicet(String str,int idx , StringBuilder nestr , boolean map[]) {
        if (idx==str.length()) {
            System.out.println(nestr);
            return;
        }

        //karm
        char cureenchar = str.charAt(idx);
        if (map[cureenchar-'a']==true) {
            //dublicate
            removetoDublicet(str, idx+1, nestr, map);
        }else{
            map[cureenchar-'a'] = true ;
            removetoDublicet(str, idx+1, nestr.append(cureenchar), map);
        }
    }

    public static int friendtsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        // //signle 
        // int fun1 = friendtsPair(n-1);

        // //pair 
        // int fun2 = friendtsPair(n-2);
        // int pair = (n-1) *fun2;

        // //total ways
        // int toways = fun1+ pair;
        // return toways;
    
        return friendtsPair(n-1) + (n-1)*friendtsPair(n-2);
    }

    public static void printBinString(int n,int LastPlace,String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        //work
        printBinString(n-1, 0, str+"0");
        if(LastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }
    

    public static void main(String[] args){
        // printtDec(5);
        // int n = 10;
        // printtInc(n);
        // System.out.println(fac(5)); 
        // System.out.println(sum (5)); 
        // System.out.println(fib(25));
        int a[]={10,2,3,10,5};
        // System.out.println(sort(a, 0)); 
        // System.out.println(latOcc(a, 5, 0));
        // System.out.println(power(2, 10));
        // System.out.println(optimpower(2, 10));
        // System.out.println(tillngProb(5));
        
        // String str = "druvdishh";
        // StringBuilder news = new StringBuilder("");
        // removetoDublicet(str, 0, news, new boolean[26]);
        
        // System.out.println(friendtsPair(4));
        
        
        printBinString(5, 0, "");
        



    }
}