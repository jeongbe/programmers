package day1;

public class 몫구하기 {

  public static int solution(int num1, int num2) {
    int answer = 0;

    answer = num1 / num2;
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(7, 2));
  }
}
