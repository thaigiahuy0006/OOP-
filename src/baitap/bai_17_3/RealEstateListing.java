package baitap.bai_17_3;

public class RealEstateListing {
    private String title;
    private String price;
    private String address;
    private String area;
    private String description;

    public RealEstateListing(String title, String price, String address, String area, String description) {
        this.title = title;
        this.price = price;
        this.address = address;
        this.area = area;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getArea() {
        return area;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Price: " + price + ", Address: " + address +
                ", Area: " + area + ", Description: " + description;
    }
}


