import java.util.*;
public class Strings {
    public static boolean palindrom(String a) {
        for (int i=0;i<a.length()/2;i++) {
            int n = a.length();
            if(a.charAt(i)==a.charAt(n-i-1)) {
                return true ;
            }
        }
        return false;
    }

    public static float getpath(String str) {
        int x=0,y=0;
        for(int i = 0;i<str.length();i++) {
            int no = str.charAt(i);
            if(no == 'S'){
                y--;
            }else if (no == 'N') {
                y++;
            }else if(no == 'E') {
                x++;
            }else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)(Math.sqrt(X2+Y2));
    }
    public static String subStrings(String str,int si,int ei) {
        String ne = "";
        for(si=0;si<ei;si++) {
            ne+=str.charAt(si);
        }
        return ne;
    }

    public static String toupperCases(String str) {
        StringBuilder ch = new StringBuilder("");
        char sb = Character.toUpperCase(str.charAt(0));
        ch.append(sb);
        for (int i=1;i<str.length();i++) {

            if(str.charAt(i) ==' '&& i<str.length()-1) {
                ch.append(str.charAt(i));
                i++;
                ch.append(Character.toUpperCase(str.charAt(i)));
            }else {
                ch.append(str.charAt(i));
            }
        }
        return ch.toString();
    }

    public static String compr(String str) {
        String newstr = "";
        for(int i=0;i<str.length();i++) {
            Integer cout=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                cout++;
                i++;
            }
            newstr+=str.charAt(i);
            if(cout>1){
                newstr+=cout.toString();
            }
        }
        return newstr;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String a = "hello";
        // String ne = sc.nextLine();
        // System.out.println(ne);

        // String n = new String("hello");
        // System.out.println(n);

        //concat
        // String firstName = sc.nextLine();
        // String lasttName = sc.nextLine();

        // System.out.println(firstName + " "+ lasttName);

        // System.out.println(lasttName.length());

        // String str = "noon";
        // System.out.println(palindrom(str));

        // String path = "NS";
        // System.out.println(getpath(path));

        // String str = "helloword";
        // str.substring(0, 5);
        // System.out.println(subStrings(str, 0, 5));

        // String fuilts[] = {"apple","banana","mongoles"};
        // String larget = fuilts[0];
        // for(int i =0;i<fuilts.length;i++) {
        //     if(larget.compareTo(fuilts[i])<0) {
        //         larget = fuilts[i];
        //     }
        // }
        // System.out.println(larget);


        //StringBulder
        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a';ch<'d';ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // String name = "i am a dhruvish lathiya";
        // System.out.println(toupperCases(name));

        String st= "aaaaaabbcccc";
        System.out.println(compr(st));

    }
}
