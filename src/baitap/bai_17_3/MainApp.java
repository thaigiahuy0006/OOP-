package baitap.bai_17_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static void main(String[] args) {
        String[] urls = {
                "https://batdongsan.com.vn/",
                "https://alonhadat.com.vn/",
                "https://nhadat247.com.vn/"
        };

        ExecutorService executor = Executors.newFixedThreadPool(urls.length);

        for (String url : urls) {
            executor.submit(new WebCrawler(url));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Đợi cho đến khi tất cả các thread hoàn thành
        }
        System.out.println("Crawling completed!");
    }
}

