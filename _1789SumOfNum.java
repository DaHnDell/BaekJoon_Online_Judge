import java.util.Scanner;

public class _1789SumOfNum {

    public static void main(String[] args) {
        long S;
        long N = 0;
        long tmp = 0;

        Scanner scanner = new Scanner(System.in);

        S = scanner.nextLong();
        if(S==1||S==2){
            System.out.println(1);
            scanner.close();
            return;
        }
        for(long i = 1; i < S; i++){
            // tmp = tmp + i;
            // N = i;
            // if(tmp > S){
            //     N -= 1;
            //     break;
            // }else if(tmp==S){
            //     break;
            // }

            
            if(tmp + i + i + 1 > S) {
                tmp = tmp + (S - tmp);
                N++;
                scanner.close();
                System.out.println(N);
                return;
            } else {
                tmp += i;
                N++;
            }

        }
    }

}