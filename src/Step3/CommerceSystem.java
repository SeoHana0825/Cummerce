package Step3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성 (불러오기)
    private Category category;
    private Customer customer;

    // 생성자 (관리하기)
    public CommerceSystem(Category category, Customer customer) {
        this.category = category;
        this.customer = customer;
    }

    public void start() {

        List<Product> products = category.getProducts();

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i);
        }

        // 종료 및 상품 번호 입력 받기
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals("0")){
            System.out.println("플랫폼을 종료합니다.");
            return;
        } else {
            category.get(Integer.parseInt(answer)-1);
        }
    }
}
