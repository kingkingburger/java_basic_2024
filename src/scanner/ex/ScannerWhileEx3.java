package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }

        System.out.println(sum);
        average = (double) sum / count;
        System.out.println(average);
    }
}
;