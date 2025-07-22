import java.util.Scanner;

public class _1094Stick {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int count = 0;
    while (X > 0) {
      if (X % 2 == 1) count++; // 현재 비트가 1이면 막대 하나 필요
      X /= 2;
    }
    System.out.println(count);
  }
}
