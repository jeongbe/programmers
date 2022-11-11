import java.util.Arrays;

public class 중앙값구하기 {
  public static void main(String[] args) {

    int answer;

    int[] array = new int[10];

    array[0] = 1;
    array[1] = 6;
    array[2] = 9;
    array[3] = 3;
    array[4] = 5;

    Arrays.sort(array); // 오름차순
    answer = array.length / 2;

    System.out.println(answer);
  }
}
