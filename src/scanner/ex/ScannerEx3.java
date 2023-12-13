package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodName = scanner.nextLine();
        int foodPrice = scanner.nextInt();
        int foodQuantity = scanner.nextInt();

        System.out.println("주문한 음식"+foodName + (foodPrice * foodQuantity));
    }
}
