package basic.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("data = " + data.value);
        changeReference(data);
        System.out.println("data = " + data.value);
    }
    static void changeReference(Data data){
        data.value = 20;
    }
}
