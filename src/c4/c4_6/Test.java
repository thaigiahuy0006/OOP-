package c4.c4_6;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal(" Ahihi so thu");
        Mammal mammal = new Mammal("Mammal");
        Cat cat = new Cat("meo");
        Dog dog1 = new Dog("con cho");
        Dog dog2 = new Dog("con cho 2");

        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog1);
        System.out.println(dog2);

        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}

