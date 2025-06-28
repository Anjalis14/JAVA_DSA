public class Oop {

    public static void main(String[] args) {
Animal d = new Animal();
d.eat();

Dog d1 = new Dog();
d1.eat();
    }

}

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...");
    }
}