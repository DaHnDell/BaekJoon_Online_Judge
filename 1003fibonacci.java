import java.util.Scanner;

public class baekjoon1003fibonacci {
    public static void main(String[] args) {
        // System.out.println();
        Scanner scanner = new Scanner(System.in);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}