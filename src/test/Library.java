package test;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private int id;
    private String name;
    private List<Book> books;
    private List<User> users;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Book> getBooks() { return books; }
    public List<User> getUsers() { return users; }

    @Override
    public String toString() {
        return "Library [ID: " + id + ", Name: " + name + "]";
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void listBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listUsers() {
        System.out.println("Users in Library:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
