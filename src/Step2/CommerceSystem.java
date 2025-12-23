package Step2;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 생성자
    public List<Product> products;

    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    // 메서드 (실행)
        public void start () {

            // 상품 불러오기
            Product product = new Product ("Galaxy S25", 130, "최신 안드로이드 스마트폰");
            Product product2 = new Product ("xiaomi X18 tep", 110, "가성비 스마트 태블릿");
            Product product3 = new Product ("Apple 17 pro", 156,"Apple 최신 스마트폰 신상 컬러 등장");
            Product product4 = new Product ("LG 스마트 TV", 400,"선명한 LDE 화면과 다양한 스마트 기능탑재");

            for (int i = 0; i < products.size(); i++) {
                System.out.println(i);
            }

            // 인덱스 저장
            products.add(product);
            products.add(product2);
            products.add(product3);
            products.add(product4);

            // getter 제품 불러오기
            System.out.println("[1] "+product.getName()+" | "+product.getPrice()+"만원"+" | "+product.getAccount());
            System.out.println("[2] "+product2.getName()+" | "+product2.getPrice()+"만원"+" | "+product2.getAccount());
            System.out.println("[3] "+product3.getName()+" | "+product3.getPrice()+"만원"+" | "+product3.getAccount());
            System.out.println("[4] "+product4.getName()+" | "+product4.getPrice()+"만원"+" | "+product4.getAccount());
            System.out.println("[0] "+ "프로그램 종료");

            // 상품 번호 입력 받기
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            // 0 을 입력하면 프로그램 종료
            if (answer.equals("0")) {
                System.out.println("플랫폼을 종료합니다");
                return;
            } else {
                products.get(Integer.parseInt(answer)-1);
            }
        }
    }
