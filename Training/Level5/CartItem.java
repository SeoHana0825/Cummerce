package Level5;

public class CartItem {
    // 장바구니 안에 있는 "물건"
    // 각 상품의 이름, 가격, 수량
    private Product product;
    private int quantity;


    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalAmount() {
        return product.getPrice() * quantity;
    }

    public String getCartItemInfo() {
        return product.getName() + " | " + product.getPrice() + " | " + product.getDescription() + "| 수량: " + quantity + "개";
    }

}
