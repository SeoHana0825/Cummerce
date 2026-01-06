package Level3;

public class Product {

    private String name;
    private int price;
    private String description;
    private int count;

    public Product(String name, int price, String description, int count) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.count = count;
    }

    public String getMySimpleInfo() {
        return this.name + " | " + this.price + " | " + this.description;
    }

    public String getMyInfo() {
        return this.name + " | " + this.price + " | " + this.description + " | " + this.count;
    }
}
