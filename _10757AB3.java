import java.math.BigInteger;
import java.util.Scanner;

public class _10757AB3 {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("0");
        BigInteger C = new BigInteger("0");

        Scanner scan = new Scanner(System.in);
        
        try {
            A = scan.nextBigInteger();  
            if(A.compareTo(C) == -1) {
                scan.close();
                return;
            }

            B = scan.nextBigInteger();
        } catch (Exception e) {
            scan.close();
            return;
        }

        scan.close();
        System.out.println(A.add(B));
    }
}
