package Step3;

import java.util.ArrayList;
import java.util.List;

public class Category {

    // product 리스트 생성
    public List<Product> products = new ArrayList<Product>();

    // product 리스트 보관 및 추가
    public void addProduct(Product product) {
        products.add(product);
    }

    // product 클래스 관리 메서드
    public List<Product> getProducts() {
        return products;
    }
}
