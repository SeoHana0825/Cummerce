package Level3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> categoryList = createCategoryList();

        CommerceSystem commerceSystem = new CommerceSystem(categoryList);

        commerceSystem.start();
    }

    public static List<Category> createCategoryList() {

        List<Category> categoryList = new ArrayList<>();

        List<Product> products = new ArrayList<>();

        products.add(new Product("Galaxy S24", 1200000, "최신 안드로이드 스마트폰", 50));
        products.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 55));
        products.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 100));
        products.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20));

        categoryList.add(new Category(products,"전자제품"));

        // products 의류
        List<Product> products2 = new ArrayList<>();

        products2.add(new Product("나이키 러닝화", 1200000, "무릎에 무리가지 않는 러닝화", 50));
        products2.add(new Product("미우미우 청바지", 1350000, "슬림한 핏과 적당한 스판의 신상 청바지", 55));
        products2.add(new Product("자라 코드", 30000, "어떤 체형에도 슬림하게 보이는 코드", 100));
        products2.add(new Product("아디다스 져지셋트", 350000, "보온과 디자인을 한번에 잡은 운동복 셋트", 20));

        categoryList.add(new Category(products2,"의류"));

        // products 식품
        List<Product> products3 = new ArrayList<>();

        products3.add(new Product("신선한 남양우유", 5000, "소화도 잘 되는 남양우유", 50));
        products3.add(new Product("말랑쫀득 두바이 초코 쫀득쿠키", 6700, "최신 핫! 트렌드 디저트", 10));
        products3.add(new Product("윤기 좔좔 찰진 이맛쌀 10kg", 59000, "고소 쫀득 이맛쌀", 5));
        products3.add(new Product("비타민 듬뿍 감귤 1kg", 35000, "당도 최상, 비타민 만땅 감귤", 20));

        categoryList.add(new Category(products3,"식품"));

        return categoryList;
    }
}
