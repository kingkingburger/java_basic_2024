package poly.ex5;

public class AnimalSoundMain {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    //    Animal animal = new Animal();

    cat.sound();
    cat.move();

    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(caw);
  }

  private static void soundAnimal(Animal animal) {
    System.out.println("동물 소리 테스트 시작");
    animal.sound();
    System.out.println("동물 소리 테스트 종료");
  }
}
