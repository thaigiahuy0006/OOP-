package test;

public class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;
    private int borrowedCount;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.borrowedCount = 0;
    }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getBorrowedCount() {
            return borrowedCount;
        }

        public void setBorrowedCount(int borrowedCount) {
            this.borrowedCount = borrowedCount;
        }

        @Override
        public String toString() {
            return "Book [ID: " + id + ", Name: " + name + ", Author: " + author +
                    ", Quantity: " + quantity + ", Borrowed: " + borrowedCount + "]";
        }

        public void updateBorrowedCount(int count) {
            if (quantity - borrowedCount >= count) {
                borrowedCount += count;
            } else {
                System.out.println("Not enough books available.");
            }
        }
    }
