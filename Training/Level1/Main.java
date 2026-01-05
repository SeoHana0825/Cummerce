package Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        productList.add(new Product("Galaxy S24", 1200000, "최신 안드로이드 스마트폰", 50));
        productList.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 55));
        productList.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 100));
        productList.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20));

        // 향상된 for 문 -> for 문 안에서만 살아있는 List
        //for (Product product : productList) {
        //    System.out.println(product.getMySimpleInfo());

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

            for (Integer i = 0; i < productList.size(); i++) {
                // product에 getMySimpleInfo 가 들어감
                System.out.println(i + 1 + ". " + productList.get(i).getMySimpleInfo());
            }
            System.out.println("0. 종료                  | 프로그램 종료");

            Integer result = 0;

            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘 못된 입력입니다. 다시 선택해 주세요.");
            }

            if (result > 0 && productList.size() >= result) {
                // 첫 번째를 나오게 하기 위해서 -1로 인덱스 0 으로 맞춰줌
                System.out.println(productList.get(result - 1).getMyInfo());
            } else {
                break;
            }
        }
    }
}
