package Step1;

public class Product {

    // 속성
    String name;
    int price;
    String account;
    int quantity;

    // 생성자
    public Product(String name, int price, String account) {
        this.name = name;
        this.price = price;
        this.account = account;
        this.quantity = quantity;
    }

    // 메서드 (기능) getter
    public  String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAccount() {
        return account;
    }

    public int getQuantity() {
        return quantity;
    }
}
