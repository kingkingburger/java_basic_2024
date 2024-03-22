package access.ex;

public class ShoppingCart {
  private Item[] items = new Item[10];
  private int itemCount;

  // TODO 나머지 코드를 완성해라.

  public void addItem(Item item) {
    if (itemCount >= 10) {
      System.out.println("장바구니가 가득 찼습니다.");
      return;
    }
    items[itemCount] = item;
    itemCount++;
  }

  public void displayItems() {
    for (int i = 0; i < itemCount; i++) {
      Item item = items[i];
      System.out.println("item.getName() = " + item.getName());
      System.out.println("item.getPrice() = " + item.getPrice());
      System.out.println("item.getQuantity() = " + item.getQuantity());
    }
  }
}
