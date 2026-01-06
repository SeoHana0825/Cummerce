package Level3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    private List<Category> categoryList;
    Scanner sc = new Scanner(System.in);

    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void start () {
        while (true) {
            System.out.println("[ 실시간 커머스 플렛폼 메인 ]");

            // category 선택 메인 디스플레이
            for(int i = 0; i < categoryList.size(); i++) {
                System.out.println(i + 1 + ". " + categoryList.get(i).getName());
            }
            System.out.println("0. 종료하기");

            int result = sc.nextInt();

            // 메인에서 번호 입력하면 category 에 넣어 놓은 리스트가 나옴
            if (result > 0 && categoryList.size() >= result) {
                categoryList.get(result-1).start();
            }
        }
    }
}
