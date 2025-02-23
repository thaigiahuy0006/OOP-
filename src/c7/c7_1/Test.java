package c7.c7_1;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        c1.setMember(true);
        c1.setMemberType("Gold");

        Visit v1 = new Visit("Alice", new Date());
        v1.setServiceExpense(100);
        v1.setProductExpense(50);

        System.out.println("Total expense: " + v1.getTotalExpense());
    }
}
