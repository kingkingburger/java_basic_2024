package basic.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData = " + bigData.count);
        System.out.println("bigData = " + bigData.data);

        // NullPointerException
        System.out.println("bigData = " + bigData.data.value);
    }
}
