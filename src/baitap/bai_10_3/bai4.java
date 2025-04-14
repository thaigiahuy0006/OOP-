package baitap.bai_10_3;

import java.io.*;

public class bai4 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\LENOVO\\IdeaProjects\\huythaii\\src\\baitap\\bai_10_3\\songuyen.txt";

        int[] numbersToWrite = {1, 11 , 22 ,33 ,55,10,9,5,3};

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int number : numbersToWrite) {
                dos.writeInt(number);
            }
            System.out.println("Ghi danh sách số nguyên vào tệp thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi vào tệp: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Các số nguyên được đọc từ tệp:");
            while (true) {
                try {
                    int number = dis.readInt();
                    System.out.println(number);
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc từ tệp: " + e.getMessage());
        }
    }
}

