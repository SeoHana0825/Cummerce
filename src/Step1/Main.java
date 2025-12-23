package Step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product product = new Product ("Galaxy S25", 1300000,"최신 안드로이드 스마트폰");
        Product product2 = new Product ("xiaomi X18 tep", 1100000,"가성비 스마트 태블릿");
        Product product3 = new Product ("Apple 17 pro", 1560000,"Apple 최신 스마트폰 신상 컬러 등장");
        Product product4 = new Product ("LG 스마트 TV", 4000000,"선명한 LDE 화면과 다양한 스마트 기능");

        List<Product> products = new ArrayList<>();

        System.out.println("[실시간 커머스 플랫폼 - 전자제품]");

        // 인덱스 반복
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i);
        }

        // 저장된 인덱스 갯수 확인 코드
        products.size();

        // 인덱스 저장
        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        // getter 제품 불러오기
        System.out.println("[1] " + product.getName()+" | "+product.getPrice() +"원 " +" | "+ product.getAccount());
        System.out.println("[2] " +product2.getName()+" | "+product.getPrice()+"원 " +" | "+ product.getAccount());
        System.out.println("[3] " +product3.getName()+" | "+product.getPrice()+"원 " +" | "+ product.getAccount());
        System.out.println("[4] " + product4.getName()+" | "+product.getPrice()+"원 " +" | "+ product.getAccount());
        System.out.println("[0] " + "프로그램 종료");


        // 0 을 입력하면 프로그램 종료
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals("0")) {
            System.out.println("플랫폼을 종료합니다.");
            return;
        }
    }
}
