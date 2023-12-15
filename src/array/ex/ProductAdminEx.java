package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        Scanner scanner = new Scanner(System.in);


        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품입력, 2:상품목록, 3:프로그램 종료");
            int option = scanner.nextInt(); // 여기서 숫자만 가져가고 enter를 해결 안하기 때문에 밑에서 처리해야함

            if (productCount >= maxProducts) {
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
            }

            if (option == 1) {
                scanner.nextLine();
                System.out.print("상품명, 가격");
                productNames[productCount] = scanner.nextLine();
                productPrices[productCount] = scanner.nextInt();
            } else if (option == 2) {
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ":" + productPrices[i] + "원");
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            productCount++;
        }
    }
}
