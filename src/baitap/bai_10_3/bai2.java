package baitap.bai_10_3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai2 {
    public static void main(String[] args) {
        String destinationFile = "C:\\Users\\LENOVO\\IdeaProjects\\huythaii\\src\\baitap\\bai_10_3\\bai2.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(destinationFile)) {

            System.out.println("Nhập nội dung (nhập 'xong' để kết thúc):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("xong")) {
                writer.write(line + System.lineSeparator()); // Ghi dòng vào file
            }

            System.out.println("Dữ liệu đã được lưu vào file: " + destinationFile);

        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
