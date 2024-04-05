package algorithm;

import java.util.*;

public class 덧칠하기 {
  public static int solution(int n, int m, int[] section) {
    int answer = 0;

    // Queue<Integer> 타입의 LinkedList 인스턴스 생성
    Queue<Integer> queue = new LinkedList<>();

    // 배열의 각 요소를 큐에 추가
    for (int number : section) {
      queue.offer(number);
    }

    // queue에서 같은 값이 있다면 1회로 치고 그 뒤에 그룹을 전부 날리려면

    while (!queue.isEmpty()) {
      int i = queue.peek();
      int end = i + (m - 1);

      queue.remove(i);
      answer++;

      for (int j = i; j <= end; j++) {
        queue.remove(j);
      }
    }

    System.out.println(answer);
    return answer;
  }

  public static void main(String[] args) {
    solution(8, 4, new int[] {2, 3, 6}); // 2
    solution(5, 4, new int[] {1, 3}); // 1
    solution(4, 1, new int[] {1, 2, 3, 4}); // 4
  }
}
