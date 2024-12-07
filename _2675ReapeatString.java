import java.util.Scanner;

public class _2675ReapeatString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = 1001; // 테스트 케이스를 반복할 전체 횟수
        while(T < 0 || T > 1000){
            T = scanner.nextInt();
        }        
        for(int i = 0; i < T; i++){ 
            int R = 0;  // 문자 하나당 반복 횟수 R
            while(R < 1 || R > 8){
                R = Integer.parseInt(scanner.next()); 
            }
            
            String S = null; // 반복 대상 문자열 
            while(S == null || S.length() < 1 || S.length() > 20){
                S = scanner.next(); 
            }
            
            String P = ""; // 반복한 문자 넣을 Empty String
            for(int j = 0; j < S.length(); j++){ //S의 길이동안~
                for(int k = 0; k < R; k++){ // R만큼 반복해서~
                    P += S.charAt(j);   // P 문자열에 다시 넣기~
                }
            }
            System.out.println(P);
        }
        scanner.close();
    }
}