package c6.c6_6;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("Kitty");
        System.out.println("Cat:");
        cat.greets();

        Dog dog1 = new Dog("Rex");
        System.out.println("\nDog:");
        dog1.greets();

        Dog dog2 = new Dog("Buddy");
        System.out.println("\nDog greets another Dog:");
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Max");
        System.out.println("\nBigDog greets:");
        bigDog1.greets();

        System.out.println("\nBigDog greets another Dog:");
        bigDog1.greets(dog1);

        BigDog bigDog2 = new BigDog("Bruno");
        System.out.println("\nBigDog greets another BigDog:");
        bigDog1.greets(bigDog2);
    }
}
