public class Astra {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name();
      
    }
}
abstract class Animal 
{
    String color;
    void pri(){
        System.out.println("hello Animal");
    }
    Animal(){
        System.out.println( "Animal constructor" );
    }

    abstract void name();
}
class Dog extends Animal {
    void name(){
        System.out.println("hello Dog");
    }
}
class Cat extends Animal{
    void name(){
        System.out.println("hello cat");
    }
}