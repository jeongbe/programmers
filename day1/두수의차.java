package day1;

public class 두수의차 {
  public static int solution(int num1, int num2) {
    int answer = 0;

    answer = num1 - num2;

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(10, 3));
  }
}
