package access.ex;

public class MaxCounter {
  private int max;
  private int count = 0;

  public MaxCounter(int max) {
    this.max = max;
  }

  void increment() {
    if (count >= max) {
      System.out.println("최대값을 넘을 수 없습니다.");
      return;
    }
    count++;
  }

  int getCount() {
    return count;
  }
}
