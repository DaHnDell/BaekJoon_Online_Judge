import java.util.Scanner;

public class _10886Cute2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int cVal = 0;
        String[] res = {"Junhee is cute!", "Junhee is not cute!"};
        try{
            int answer = 0;
            N = scanner.nextInt();
            for(int i = 0; i < N; i++){
               answer = scanner.nextInt();
               if(answer == 0){
                    cVal--;
                }else{
                    cVal++;
                }
            }
            if(cVal > 0) {
                System.out.print(res[0]);
            }else{
                System.out.print(res[1]);
            }

        }catch(Exception e){
            scanner.close();
            return;
        }
        
    }
    // private static int survey(int i, int val){
    //     if(i == 0){
    //         val--;
    //     }else{
    //         val++;
    //     }
    //     if(val > 0) {
    //         return 0;
    //     }else{
    //         return 1;
    //     }
    // }
}
