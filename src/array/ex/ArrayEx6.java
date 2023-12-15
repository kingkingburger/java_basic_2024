package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < n; i++) {
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }

        System.out.println("가장 작은 정수" + min +"가장큰 정수"+ max);

    }
}
