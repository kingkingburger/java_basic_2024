package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {

            System.out.println("1. 상품입력, 2:결제, 3:프로그램 종료");
            int option = scanner.nextInt(); // 여기서 숫자만 가져가고 enter를 해결 안하기 때문에 밑에서 처리해야함

            if (option == 1) {
                scanner.nextLine();
                System.out.print("상품명, 가격, 수량 입력");

                String name = scanner.nextLine();
                int price = scanner.nextInt();
                int quantity = scanner.nextInt();

                sum += (price * quantity);

            } else if (option == 2) {
                System.out.println("총 비용: " + sum);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }


    }
}
