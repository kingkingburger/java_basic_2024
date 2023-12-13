package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int intValue1 = scanner.nextInt();
            int intValue2 = scanner.nextInt();

            if (intValue1 == 0 && intValue2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(intValue1 + intValue2);

        }
    }
}
