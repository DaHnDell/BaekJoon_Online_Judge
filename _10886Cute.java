import java.util.Scanner;

public class _10886Cute {
    public static void main(String[] args) {
        int N;
        int cute = 0;
        int notCute = 0;
        Scanner scan = new Scanner(System.in);

        try {
            N = scan.nextInt();
            if((N < 1 || N > 101) && (N % 2 == 0) ) {
                scan.close();
                return;
            }

            for(int i = 0; i < N ; i++) {
                int servey = scan.nextInt();
                if(servey != 0 && servey != 1) {
                    scan.close();
                    return;
                }

                if(servey == 1) {
                    cute++;
                } else {
                    notCute++;
                }
            }
        } catch(Exception e) {
            scan.close();
            return;
        }
        scan.close();
        System.out.println(cute > notCute ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
