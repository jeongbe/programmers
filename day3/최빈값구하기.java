public class 최빈값구하기 {
  public static void main(String[] args) {
    int[] array = { 2, 2, 3, 3 };
    int[] index = new int[10000]; // 배열값은 크게잡자...런타임에러나서 3시간 낭비했노.. 잊어비리지 말기

    int max = Integer.MIN_VALUE; // 최빈값 몇번들어 갔는지 /임의로 작은수 배정정
    int mode = 0; // 최빈값

    for (int i = 0; i < array.length; i++) {
      index[array[i]]++;
    }

    for (int i = 0; i < index.length; i++) {
      if (max < index[i]) {
        max = index[i]; // index[3] = 3번
        mode = i; // 3
      } else if (max == index[i]) {
        mode = -1;
      } else if (array.length < 1) {
        mode = array[0];
      }
    }

    // System.out.println(max);
    System.out.println(mode);
  }
}
