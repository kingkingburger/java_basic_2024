package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 100;
        int i = 0;
        int sum = 0;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        for (int j = 0; j < max; j++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
