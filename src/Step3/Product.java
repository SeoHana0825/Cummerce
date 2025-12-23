package Step3;

public class Product {

    // 속성
    String name;
    int price;
    String account;
    int quantity;

    // 생성자 (객체 만들기)
    public Product (String name, int price, String account) {
        this.name = name;
        this.price = price;
        this.account = account;
    }

    // 기능 메서드 1. getter
    public String getName() {
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

    // 기능 메서드 2. setter
    public void setName(String name) {
    }
    public void setPrice(int price) {
    }
    public void setAccount(String account) {
    }
    public void setQuantity(int quantity) {
    }
}
