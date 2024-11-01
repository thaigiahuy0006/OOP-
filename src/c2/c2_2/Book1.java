package c2.c2_2;

import c2.c2_1.Author;

public class Book1 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    public Book1(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book1(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {
        String text =  "Book[name=" + name +  ", authors={Author[name="+ name +",email="+ authors[0].getEmail()+",gender="+authors[0].getGender();
        for (int i = 0; i < authors.length; i++) {
            text += authors[i].toString();
        }
        text   += ",price=" + price + ",qty=" + qty + "]";
        return text;
    }
    public String getAuthorNames() {
        String text = "authorName1"+",authorName2";
        return text;
    }
}
