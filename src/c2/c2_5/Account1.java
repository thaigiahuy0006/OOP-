package c2.c2_5;

public class Account1 {
    private int id;
    private Customer1 customer;
    private double balance = 0.0;

    public Account1(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account1(int id, Customer1 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        String text = getCustomer().getName() + "(" + id + ")" + "balence=$" + getBalance();
        return text;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account1 deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account1 withdraw(double amount) {
        if (amount >= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
        }
    }

