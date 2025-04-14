package baitap.bai_10_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bai1 {
    public static void main(String[] args) {
        String dau = "C:\\Users\\LENOVO\\IdeaProjects\\huythaii\\src\\baitap\\bai_10_3\\dau.txt";
        String cuoi = "C:\\Users\\LENOVO\\IdeaProjects\\huythaii\\src\\baitap\\bai_10_3\\cuoi.txt";

        try (FileInputStream fis = new FileInputStream(dau);
             FileOutputStream fos = new FileOutputStream(cuoi)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Sao chép file thành công!");

        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
