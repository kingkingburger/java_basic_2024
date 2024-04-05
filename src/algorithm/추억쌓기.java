package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 추억쌓기 {
  public static List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
    List<Integer> answer = new ArrayList<Integer>();
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < name.length; i++) {
      hashMap.put(name[i], yearning[i]);
    }

    for (String[] strings : photo) {
      int sum = 0;
      for (String string : strings) {
        sum += hashMap.getOrDefault(string, 0);
      }
      answer.add(sum);
    }

    return answer;
  }

  public static void main(String[] args) {
    List<Integer> solution1 =
        solution(
            new String[] {"may", "kein", "kain", "radi"},
            new int[] {5, 10, 1, 3},
            new String[][] {
              {"may", "kein", "kain", "radi"},
              {"may", "kein", "brin", "deny"},
              {"kon", "kain", "may", "coni"}
            });
    System.out.println("solution1 = " + solution1);

    List<Integer> solution2 =
        solution(
            new String[] {"kali", "mari", "don"},
            new int[] {11, 1, 55},
            new String[][] {
              {"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}
            });
    System.out.println("solution2 = " + solution2);
  }
}
