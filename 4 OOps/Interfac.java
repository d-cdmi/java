public class Interfac {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Whatis();
    }
}

// interface  Animal {
//     void name();    
// }
// class hell implements Animal {
//     public void name(){
//         System.out.println( "Hello World!" );
//     }
// }

/**
 * vejitor
 */
interface vejitor {

    void nameAll();
}
 
interface Novejitor {

    void Whatis();    
}
class Dog implements Novejitor, vejitor{
    public void nameAll(){
        System.out.println( "I am a dog." );
    }
    public void Whatis(){
        System.out.println( "I am a novel dog." );
    }
}

