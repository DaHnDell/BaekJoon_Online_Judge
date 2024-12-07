import java.util.Scanner;

public class _2935Noise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = 0;
        int B = 0;
        String operand = "";

        while(A <= 0 || A % 10 != 0 && A / 10 != 1){
            A = Integer.parseInt(scanner.next());
        }
        
        if(!(operand.equals("+") || operand.equals("*"))){
            operand = scanner.next();
        }

        while(B <=0 || B % 10 != 0 && B / 10 != 1){
            B = Integer.parseInt(scanner.next());
        }

        switch (operand) {
            case "+":
                System.out.println(A + B);
                break;
        
            case "*":
                System.out.println(A*B);
                break;
        }
        scanner.close();
    }
}