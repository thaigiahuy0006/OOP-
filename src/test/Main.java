package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(1, "Central Library");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Library");
            System.out.println("2. View Library Information");
            System.out.println("3. Add/Edit/Delete User");
            System.out.println("4. Add/Edit/Delete Book");
            System.out.println("5. Search Book/User by Name");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. View Books List");
            System.out.println("9. View Users List");
            System.out.println("10. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Tạo thư viện mới
                    break;
                case 2:
                    System.out.println(library);
                    System.out.println("Books: " + library.getBooks().size());
                    System.out.println("Users: " + library.getUsers().size());
                    break;
                case 3:
                    // Thêm/Sửa/Xóa người dùng
                    break;
                case 4:
                    // Thêm/Sửa/Xóa sách
                    break;
                case 5:
                    // Tìm kiếm sách/người dùng theo tên
                    break;
                case 6:
                    // Mượn sách
                    break;
                case 7:
                    // Trả sách
                    break;
                case 8:
                    library.listBooks();
                    break;
                case 9:
                    library.listUsers();
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
            }
        }
    }
}
