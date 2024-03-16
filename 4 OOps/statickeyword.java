public class statickeyword {
    public static void main(String[] args) {
        student s1 = new student();
        s1.school = "svs";
        
        student s2 = new student();
        System.out.println(s2.school); 
        s1.gettotal(10, 20, 30);

        dog d = new dog();
        System.out.println(d.school); 
    }
}

class student {

    int rNO;
    String name;

    static void gettotal(int c,int cpp,int java){
        System.out.println(c+cpp+java);
    }

    static String school ;
    void getName(String name){
        System.out.println(name);
    }
}
class dog extends student{
    dog(){
        super.school = "Dog";
        System.out.println( "Dog constructor" );
    }
}