package basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주문할 개수를 입력하세요");
        System.out.println("i = " + i);
        ProductOrder[] orders = new ProductOrder[i];

        for (int j = 0; j < i; j++) {
            Scanner scanner2 = new Scanner(System.in);
            String s = scanner2.nextLine();
            int i1 = scanner2.nextInt();
            int i2 = scanner2.nextInt();
            scanner2.nextLine();
            orders[j] = createOrder(s, i1, i2);
        }
        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println(totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName);
            System.out.println(order.price);
            System.out.println(order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for(ProductOrder order : orders){
            sum += order.price;
        }
        return sum;
    }
}
