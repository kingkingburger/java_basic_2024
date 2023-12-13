package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        int num2 = scanner.nextInt();

        System.out.println("당신의 이름은" + str1 + "나이는" + num2);
    }
}
