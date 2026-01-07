package Level5;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private List<Category> categoryList;
    private Cart cart;

    private final Scanner sc = new Scanner(System.in);

    // 카테고리에 있는 상세 내용 불러오기
    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
        this.cart = new Cart();
    }

    public void start() {
        while (true) {
            displayMainMenu();

            int result = 0;
            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 값이 입력되었습니다.");
                sc.next();
                continue;
            }

            // 장바구니 선택
            if (result > 0 && categoryList.size() >= result) {
                categoryList.get(result - 1).start(this.cart);
            } else if (result == 4 && !cart.isEmpty()) {
                showCartAndOrder();
            } else if (result == 5 && !cart.isEmpty()) {
                cancelOrder();
            } else if ((result == 4 || result == 5) && cart.isEmpty()) {
                System.out.println("장바구니에 담긴 상품이 없습니다");
            } else if (result == 0) {
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println();
        System.out.println("아래 메뉴를 선택해주세요");
        System.out.println();
        System.out.println(" [ 실시간 커머스 플렛폼 메인 ] ");

        for (int index = 0; index < categoryList.size(); index++) {
            System.out.println(index + 1 + ". " + categoryList.get(index).getName());
        }
        System.out.println("0. 종료하기");

        if (!cart.isEmpty()) {
            System.out.println();
            System.out.println("[ 주문 관리 ]");
            System.out.println("4. 장바구니 확인       | 장바구니를 확인 후 주문합니다");
            System.out.println("5. 주문 취소          | 진행중인 주문을 취소합니다");
        }
    }

    private void showCartAndOrder() {

        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        cart.displayCarts();

        System.out.println("1. 주문 확정 | 2. 메인으로 돌아가기");

        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println("잘못된 값이 입력되었습니다");
            sc.next();
            return;
        }

        if (choice == 1) {
            processOrder();
        } else if (choice == 2) {
            return;
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    private void processOrder() {
        int totalAmount = cart.getTotalAmount();

        // 재고 검증
        for (CartItem item : cart.getCartItems()) {
            Product product = item.getProduct();
            int quantity = item.getQuantity();

            if (product.getCount() < quantity) {
                System.out.println("재고 부족: " + product.getName() + "(재고" + product.getCount() + "개");
                return;
            }
        }

        // 일괄 차감
        for (CartItem item : cart.getCartItems()) {
            Product product = item.getProduct();
            int quantity = item.getQuantity();

            int before = product.getCount();
            product.decreaseStock(quantity);

            int after = product.getCount();
            System.out.println(product.getName() + "재고: " + before + "개 -> " + after + "개");
        }
        System.out.println("주문이 완료되었습니다. 총 금액: " + String.format("%,d원", totalAmount));
        cart.clear();
    }

    private void cancelOrder() {
        cart.clear();
        System.out.println("주문이 취소되었습니다");
    }
}
