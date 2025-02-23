package c3.c3_2;

public class Test {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(4.4, 5.5, 6.6, 7.7, 8.8);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);
        System.out.println("Degree of Polynomial 1: " + p1.getDegree());
        System.out.println("Degree of Polynomial 2: " + p2.getDegree());
        System.out.println("Polynomial 1 evaluated at x = 2: " + p1.evaluate(2));
        System.out.println("Polynomial 2 evaluated at x = 2: " + p2.evaluate(2));

        MyPolynomial sum = p1.add(p2);
        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sum);

        MyPolynomial product = p1.multiply(p2);
        System.out.println("Product of Polynomial 1 and Polynomial 2: " + product);
    }
}

