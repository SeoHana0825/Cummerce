package Level5;

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

    // 메뉴 보드 디자인
    public String getMySimpleInfo() {
        return this.name + " | " + this.price + " | " + this.description;
    }

    // 메뉴 선택 후 상세 내용 디자인
    public String getMyInfo() {
        return this.name + " | " + this.price + " | " + this.description + " | " + this.count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    // 재고 부족 시 경고/처리
    public void decreaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1개 이상이어야 합니다");
        }

        if (this.count < quantity) {
            throw new IllegalStateException("재고가 부족합니다. (현재 재고: " + this.count + "개)");
        }
        this.count -= quantity;
    }
}
