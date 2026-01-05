package Level1;

public class Product {

    // 필드 (속성) : 값을 만들다
    private String name;
    private Integer price;
    private String description;
    private Integer count;

    // 생성자
    public Product(String name, Integer price, String description, Integer count) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.count = count;
    }

    // 메서드
    public String getMySimpleInfo() {
        return this.name + " | " + this.price + " | " + this.description;
    }

    public String getMyInfo() {
        return this.name + " | " + this.price + " | " + this.description + " | " + this.count;
    }


}
