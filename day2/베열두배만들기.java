package day2;

public class 베열두배만들기 {

  public static void main(String[] args) {
    int[] solution = new int[3];

    solution[0] = 4;
    solution[1] = 5;
    solution[2] = 3;

    for (int i = 0; i < solution.length; i++) {
      solution[i] = solution[i] * 2;
      System.out.println(solution[i]);
    }

  }
}
