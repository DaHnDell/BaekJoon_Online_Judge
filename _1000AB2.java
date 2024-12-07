import java.util.Scanner;

public class _1000AB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        while(A <= 0 || 10 <= A){
            A = scanner.nextInt();
        }
        
        int B = 0;
        while(B <= 0 || 10 <= B){
            B = scanner.nextInt();
        }

        System.out.println(A - B);
        scanner.close();   
    }
}
