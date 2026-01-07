package Level5;

import java.util.List;
import java.util.Scanner;

public class Category {

    private List<Product> products;
    private String name;

    Scanner sc = new Scanner(System.in);

    public Category(List<Product> products, String name) {
        this.products = products;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 메인 디스플레이 클릭 후 상세 내용 선택
    public void start (Cart cart) {
        while (true) {
            System.out.println("[ 실시간 커머스 플렛폼 " + this.name + " ]");

            for (int i = 0; i < this.products.size(); i++) {
                System.out.println(i + 1 + ". " + products.get(i).getMySimpleInfo());
            }
            System.out.println("0. 뒤로가기");

            int result = 0;

            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘 못된 입력입니다. 다시 선택해 주세요");
            }

            if (result > 0 && result <= products.size()) {
                System.out.println(products.get(result-1).getMySimpleInfo());
            } else {
                break;
            }

            Product selected = products.get(result -1);
            System.out.println();
            System.out.println("선택한 상품: " + selected.getMyInfo());

            // 수량 입력
            System.out.println("수량을 입력하세요");

            int quantity;

            try {
                quantity = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 숫자로 입력해주세요");
                sc.next();
                continue;
            }

           // 추가, 취소
            System.out.println("장바구니에 추가하시겠습니까? (1. 추가, 2. 취소): " );

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                sc.next();
                continue;
            }

            if (choice == 1) {
                cart.addProduct(selected, quantity);
                System.out.println("장바구니에 담았습니다.");

                cart.displayCarts();
            } else if (choice == 2) {
                System.out.println("취소했습니다");
            } else  {
                System.out.println("잘못된 선택입니다.");
                break;
            }
        }
    }
}
