package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int j = 1; j <= 9; j++) {
            System.out.println(num + "*" + j +"="+ num*j);
        }
    }
}
