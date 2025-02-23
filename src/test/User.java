package test;

import java.util.List;
import java.util.ArrayList;

public class User implements UserActions {
    private int id;
    private String name;
    private String gender;
    private String birthDate;
    private String className;
    private String studentCode;
    private List<Book> borrowedBooks;

    public User(int id, String name, String gender, String birthDate, String className, String studentCode) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.className = className;
        this.studentCode = studentCode;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getStudentCode() { return studentCode; }
    public void setStudentCode(String studentCode) { this.studentCode = studentCode; }

    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    @Override
    public String toString() {
        return "User [ID: " + id + ", Name: " + name + ", Gender: " + gender +
                ", BirthDate: " + birthDate + ", Class: " + className +
                ", Student Code: " + studentCode + "]";
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 5) {
            borrowedBooks.add(book);
            book.updateBorrowedCount(1);
        } else {
            System.out.println("You can borrow a maximum of 5 books.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.updateBorrowedCount(-1);
        } else {
            System.out.println("This book is not in the borrowed list.");
        }
    }

    @Override
    public void searchBook(String bookName) {
        for (Book book : borrowedBooks) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void checkBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}

