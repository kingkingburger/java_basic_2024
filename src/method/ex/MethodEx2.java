package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String mesagge = "Hello, world!";

        printCount(3, mesagge);
        printCount(5, mesagge);
        printCount(7, mesagge);
    }

    public static void printCount(int num, String message){
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}
