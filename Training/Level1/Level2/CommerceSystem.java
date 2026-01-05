package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private List<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 밖에서 오는 필드를 안에서 메핑 해줘라!!
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    // 밖에 넘겨줄게 없으니 void 로 설정
    public void start(){
        while(true) {
            for (Integer i = 0; i < products.size(); i++) {
                System.out.println(i + 1 + ". " + products.get(i).getMySimpleInfo());
            }
            System.out.println("0. 종료                         | 프로그램 종료");

            Integer result = 0;

            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘 못된 입력입니다. 다시 선택해 주세요");
            }

            if (result > 0 && products.size() >= 0) {
                System.out.println(products.get(result - 1).getMyInfo());
            } else {
                break;
            }
        }
    }
}
