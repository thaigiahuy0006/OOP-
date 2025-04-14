package baitap.bai_10_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai3 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LENOVO\\IdeaProjects\\huythaii\\src\\baitap\\bai_10_3\\dau.txt";

        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng trong file là: " + lineCount);
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
