package Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {

    private List<Product> products;
    private String name;

    Scanner sc = new Scanner(System.in);

    public Category(List<Product> products,String name) {
        this.products = products;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void start () {
        while (true) {
            System.out.println("[ 실시간 커머스 플렛폼 " + this.name + " ]");

            for(int i = 0; i < products.size(); i++) {
                System.out.println(i + 1 + ". " + products.get(i).getMySimpleInfo());
            }
            System.out.println("0. 뒤로가기");

            int result = 0;

            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘 못된 입력입니다. 다시 선택해 주세요");
            }

            if (result > 0 && products.size() >= 0) {
                System.out.println(products.get(result-1).getMyInfo());
            } else {
                break;
            }
        }
    }
}
