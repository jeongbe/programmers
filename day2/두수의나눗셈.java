package day2;

public class 두수의나눗셈 {

  public static double solution(double num1, double num2) {
    double answer = 0.0;
    answer = num1 / num2 * 1000;
    return (int) answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(3, 2));
  }
}
