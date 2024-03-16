/**
 * OOPS
 */
public class OOPS {
    public static void main(String[] args) {
        // bank s1 = new bank();
        // s1.pen = "red";
        // System.out.println(s1.pen);
        // bank s1 = new bank();
        
        Dog s = new Dog();
        s.getName();
        s.i=10;
        System.out.println(s.i);

    }
}

// class bank {
//     // String pen = new String();
//     bank() {
//         System.out.println("hello");
//     }    
// }

class Animal {

    String name;
    int age;
    void getName() {
        System.out.println("hello");
    }
    void getAge() {
        System.out.println(96);
    }
}

class vejeter extends Animal {
    String color;
    void color(){
        System.out.println("brown");
    }
}
class vejedter extends Animal {
    String color;
    void color(){
        System.out.println("brown");
    }
}
class b extends Animal {
    String color;
    void color(){
        System.out.println("brown");
    }
}

class Dog extends vejeter {
    int i;
}

