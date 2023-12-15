package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] students = new int[4][3];

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print((j + 1) + "번 째 점수:");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.print(i + "번 학생의 총점");
            double sum = 0;
            for (int j = 0; j < students[i].length; j++) {
                sum += students[i][j];
            }
            System.out.print(sum);
            System.out.println("평균 : "+ (sum / students[i].length));
        }
    }
}
