package static2.ex;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MathArrayUtils {
  static int sum(int[] nums) {
    return Arrays.stream(nums).sum();
  }

  static OptionalDouble average(int[] nums) {
    return Arrays.stream(nums).average();
  }

  static OptionalInt min(int[] nums) {
    return Arrays.stream(nums).min();
  }

  static OptionalInt max(int[] nums) {
    return Arrays.stream(nums).max();
  }
}
