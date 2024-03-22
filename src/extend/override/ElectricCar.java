package extend.override;

public class ElectricCar extends Car {
  @Override
  public void move() {
    System.out.println("빠르게 이동한다.");
  }

  public void charge() {
    System.out.println("충전");
  }
}
