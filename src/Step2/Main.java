package Step2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        System.out.println("[실시간 커머스 플랫폼 - 전자제품]");

        CommerceSystem system = new CommerceSystem(products);
        system.start();
    }
}
