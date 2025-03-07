package c2.c2_4;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString() {
        String text = name + "("+id+")" + "("+discount+"%)";
        return text;
    }
}
