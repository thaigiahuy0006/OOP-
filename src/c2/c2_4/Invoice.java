package c2.c2_4;

public class Invoice {
    private int id;
    private c2.c2_4.Customer customer;
    private double amount;
    public Invoice(int id, c2.c2_4.Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public c2.c2_4.Customer getCustomer() {
        return customer;
    }
    public void setCustomer(c2.c2_4.Customer customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount - ((amount * customer.getDiscount())/100);
    }
    public String toString() {
        String text = "Invoice[id=" + id + ", customer=name" + "(" + getCustomerName() + ")" + "(" + getCustomerDiscount() + ")" + "(" + getAmount() + ")" + "]";
        return text;
    }

}
