package day2;

public class 분수의덧셈 {

  public static void main(String[] args) {
    int denum1 = 1;
    int num1 = 2;
    int denum2 = 3;
    int num2 = 4;

    int[] answer = new int[2];

    answer[1] = num1 * num2; // 분모
    answer[0] = (denum1 * num2) + (denum2 * num1); // 분자

    // 최대공약수 구한후 분자,분모에 나눠줌
    int min = Math.min(answer[0], answer[1]);
    int max = 1;

    for (int i = 1; i <= min; i++) {
      if (answer[0] % i == 0 && answer[1] % i == 0) {
        max = i;
      }
    }
    answer[0] /= max;
    answer[1] /= max;

    System.out.println("answer[0] = " + answer[0] + " " + "answer[1] = " + answer[1]);
  }
}
