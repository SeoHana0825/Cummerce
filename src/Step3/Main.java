package Step3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("[ 실시간 커머스 플랫폼 ]");

        // category 생성
        Category category = new Category();

        // product 생성 + category 추가
        category.addProduct(new Product("Galaxy S25", 130,"최신 안드로이드 스마트폰"));
        category.addProduct(new Product("xiaomi X18 tep", 110,"가성비 스마트 태블릿"));
        category.addProduct(new Product("Apple 17 pro", 156,"Apple 최신 스마트폰 신상 컬러 등장"));
        category.addProduct(new Product("LG 스마트 TV", 400,"선명한 LDE 화면과 다양한 스마트 기능"));

        // customer 생성
        Customer customer = new Customer("자바","dlkcnsdh@gamil.com","브론즈");
        Customer customer2 = new Customer("하루카","ckdn12@gmail.com","실버");
        Customer customer3 = new Customer("청하","dckdk_1093@naver.com","골드");

        //
        CommerceSystem system = new CommerceSystem( category, customer);

        // 실행
        system.start();

    }
}
