import java.util.Scanner;

public class _1233Dice {
  //
  public static void main(String[] args) {
    int S1, S2, S3;
    Scanner scanner = new Scanner(System.in);
    // S1 = scanner.nextInt();
    // S1 = (S1 < 2 || S1 > 20) ? S1 = scanner.nextInt() : S2 = scanner.nextInt();
    S1 = scanner.nextInt();
    while (S1 < 2 || S1 > 20) {
      S1 = scanner.nextInt();
    }
    //
    S2 = scanner.nextInt();
    while (S2 < 2 || S2 > 20) {
      S2 = scanner.nextInt();
    }

    S3 = scanner.nextInt();
    while (S3 < 2 || S1 > 40) {
      S3 = scanner.nextInt();
    }

    scanner.close();

    boolean flag = true;
    while (flag) {
      int[] S1Arr = new int[S1];
      int[] S2Arr = new int[S2];
      int[] S3Arr = new int[S3];

      for (int i = 0; i < S1; i++) {
        S1Arr[i] = i + 1;
      }
      for (int j = 0; j < S2; j++) {
        S2Arr[j] = j + 1;
      }
      for (int k = 0; k < S3; k++) {
        S3Arr[k] = k + 1;
      }

      for (int l = 0; l < 3; l++) {
        // 3개의 주사위를 굴려 각 시행에 대한 합의 경우의 수 구하기
        int add = S1 > S2 ? S1 : S2; // S1과 S2 중 최대치
        int sum = 0;
        int[] sumArr = new int[S3]; // 각 시행의 최대치
        // for(int tmp = 0; tmp < add; tmp++){
        // sum = S1arr[tmp] + S2arr[tmp] + S3arr[tmp];
        // }

        for (int arrAdd = 0; arrAdd < add; arrAdd++) {
          sum += S1Arr[arrAdd];
          // sumArr[arrAdd] = sumArr == null ? 0 : sumArr[arrAdd];
          sum += S2Arr[arrAdd];
          sumArr[arrAdd] += sum;
          for (int s3Add = 0; s3Add < S3; s3Add++) {
            sum += S3Arr[s3Add];
            sumArr[s3Add] += sum;
          }
        }
        int[] tmpCnt = new int[0];
        for (int lastSum = 0; lastSum < sumArr.length; lastSum++) {
          // 미결
        }

      }
    }
  }
}