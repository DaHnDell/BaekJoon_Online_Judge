import java.util.Scanner;

public class _1008AB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    System.out.printf("%.10f", a / b);
    sc.close();
  }
}