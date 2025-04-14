package baitap.bai_17_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterUtil {
    public static void writeToCSV(String fileName, List<RealEstateListing> listings) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("Title,Price,Address,Area,Description\n");
            for (RealEstateListing listing : listings) {
                writer.append(listing.getTitle()).append(",")
                        .append(listing.getPrice()).append(",")
                        .append(listing.getAddress()).append(",")
                        .append(listing.getArea()).append(",")
                        .append(listing.getDescription()).append("\n");
            }
        }
    }
}

