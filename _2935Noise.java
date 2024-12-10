import java.util.Scanner;
import java.lang.Math;

public class _2935Noise {
    private static final int TEN = 10;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int A = 0;
        int B = 0;
        String operand = "";

        while(A <= 0 || A % 10 != 0 && A / 10 != 1){
            try {
                A = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                continue;
            }            
        }

        while (A % 10 != 0) {
            for(int i = 1; i <= 99; i++){
                if(A==Math.pow(TEN, i)){
                    return;
                }
                
            }
            
        }

        if(!(operand.equals("+") || operand.equals("*"))){
            operand = scanner.next();
        }

        while(B <=0 || B % 10 != 0 && B / 10 != 1){
            try{
                B = Integer.parseInt(scanner.next());
            } catch(Exception e){
                continue;
            }
            
        }

        // switch (operand) {
        //     case "+":
        //         System.out.println(A + B);
        //         break;
        
        //     case "*":
        //         System.out.println(A*B);
        //         break;
        // }
        System.out.printf("%d", operand.equals("*") ? A * B : A + B);
        scanner.close();
    }

    public static boolean condition(int num) {
        return true;
    }

    // public static boolean condition2(String str){
    //     if(str.length() < 100){
    //         Integer.parseInt(str);

    //     }
    //     return true;
    // }
}