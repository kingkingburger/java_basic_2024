package basic.ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        ProductOrder dubo = createOrder("dubo", 2000, 1);
        ProductOrder kimch = createOrder("kimch", 5000, 1);
        ProductOrder cola = createOrder("cola", 1500, 2);
        orders[0] = dubo;
        orders[1] = kimch;
        orders[2] = cola;

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
