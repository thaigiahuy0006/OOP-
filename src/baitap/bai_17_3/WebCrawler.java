package baitap.bai_17_3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebCrawler implements Runnable {
    private String url;

    public WebCrawler(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        List<RealEstateListing> listings = crawlPage(url);
        // Bạn có thể xử lý dữ liệu tại đây, ví dụ lưu vào file
        listings.forEach(System.out::println);
    }

    public static List<RealEstateListing> crawlPage(String url) {
        List<RealEstateListing> listings = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(url).get();
            Elements titles = doc.select(".title-class"); // Thay bằng selector thực tế
            Elements prices = doc.select(".price-class");
            Elements addresses = doc.select(".address-class");
            Elements areas = doc.select(".area-class");
            Elements descriptions = doc.select(".description-class");

            for (int i = 0; i < titles.size(); i++) {
                String title = titles.get(i).text();
                String price = prices.get(i).text();
                String address = addresses.get(i).text();
                String area = areas.get(i).text();
                String description = descriptions.get(i).text();
                listings.add(new RealEstateListing(title, price, address, area, description));
            }
        } catch (IOException e) {
            System.err.println("Error fetching data from URL: " + url);
            e.printStackTrace();
        }
        return listings;
    }
}

