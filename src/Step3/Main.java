package Step3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Category> categoryList = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>();

        Product product = new Product("Galaxy S25", 130,"최신 안드로이드 스마트폰");
        Product product2 = new Product("xiaomi X18 tep", 110,"가성비 스마트 태블릿");
        Product product3 = new Product("Apple 17 pro", 156,"Apple 최신 스마트폰 신상 컬러 등장");
        Product product4 = new Product("LG 스마트 TV", 400,"선명한 LDE 화면과 다양한 스마트 기능");

        System.out.println("[ 실시간 커머스 플랫폼 ]");

        Customer customer = new Customer("자바","dlkcnsdh@gamil.com","브론즈");
        Customer customer2 = new Customer("하루카","ckdn12@gmail.com","실버");
        Customer customer3 = new Customer("청하","dckdk_1093@naver.com","골드");

        CommerceSystem system = new CommerceSystem();
        system.start();

        // getter 제품 불러오기
        System.out.println("[1] " + product.getName()+" | "+product.getPrice() +"원 " +" | "+ product.getAccount());
        System.out.println("[2] " +product2.getName()+" | "+product.getPrice()+"원 " +" | "+ product.getAccount());
        System.out.println("[3] " +product3.getName()+" | "+product.getPrice()+"원 " +" | "+ product.getAccount());
        System.out.println("[4] " + product4.getName()+" | "+product.getPrice()+"원 " +" | "+ product.getAccount());
        System.out.println("[0] " + "프로그램 종료");

    }
}
