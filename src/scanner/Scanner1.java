package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(str);

        int intValue = scanner.nextInt();
        System.out.println(intValue);
    }
}
