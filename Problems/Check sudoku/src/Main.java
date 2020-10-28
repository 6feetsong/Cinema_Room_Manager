import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int range = val * val;
        int[][] table = new int[range][range];
        int[] sample = new int[range];
        boolean result = true;

        for (int i = 0; i < range; i++) {
            sample[i] = i + 1;
            for (int j = 0; j < range; j++) {
                table[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < range; i++) {
            int[] test1 = new int[range];
            int[] test2 = new int[range];
            for (int j = 0; j < range; j++) {
                test1[j] = table[i][j];
                test2[j] = table[j][i];
            }
            Arrays.sort(test1);
            Arrays.sort(test2);
            if (Arrays.equals(sample, test1) == false) {
                result = false;
                break;
            }
            if (Arrays.equals(sample, test2) == false) {
                result = false;
                break;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}