package static2.ex;

public class Car {
  static String names;
  static int carCount = 0;

  Car(String name) {
    names = name;
    carCount++;
    System.out.println("carCount = " + carCount);
  }

  static void showTotalCars() {
    System.out.println("carCount = " + carCount);
  }
}
