import java.util.Scanner;

public class _2480Dice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cubes = new int[3];
        int prize = 0;

        try {
            for(int i = 0; i < 3; i++) {
                cubes[i] = scanner.nextInt();
                if(cubes[i] > 6 || cubes[i] < 0) {
                    scanner.close();
                    return;
                }
            }

            if(cubes[0] == cubes[1] && cubes[1] == cubes[2]) {
                prize = 10000 + cubes[0] * 1000;
            } else if((cubes[0] == cubes[1] && cubes[0] != cubes[2]) || (cubes[0] == cubes[2] && cubes[0] != cubes[1])) {
                prize = 1000 + cubes[0] * 100;
            } else if(cubes[1] == cubes[2] && cubes[0] != cubes[0]) {
                prize = 1000 * cubes[1] * 100;
            } else {
                prize = maxNum(cubes) * 100;
            }

        } catch(Exception e) {
            scanner.close();
            return;
        }
        scanner.close();
        System.out.println(prize);
    }

    private static int maxNum(int[] arr) {
        int max = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
