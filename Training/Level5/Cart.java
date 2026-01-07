package Level5;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 장바구니만!! "상자"

    private List<CartItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getName().equals(product.getName())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    // 전체 금액 확인
    public int getTotalAmount() {
        int total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalAmount();
        }
        return total;
    }

    // 카트 안에 있는 물건 비우기
    public void clear() {
        cartItems.clear();
    }

    public void displayCarts() {
        if (isEmpty()) {
            System.out.println("장바구니가 비었습니다.");
            return;
        }

        System.out.println();
        System.out.println("[ 장바구니 내역 ]");
        for (CartItem item : cartItems) {
            System.out.println(item.getCartItemInfo());
        }
        System.out.println();
        System.out.println("[ 총 주문 금액 ]");
        System.out.println(String.format("%,d원", getTotalAmount()));
        System.out.println();
    }

}
