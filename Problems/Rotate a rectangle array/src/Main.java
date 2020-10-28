import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] inputTable = new int[r][c];
        int[][] outputTable = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                inputTable[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                outputTable[i][j] = inputTable[Math.abs(r - j) - 1][i];
            }
            printout(outputTable[i]);
        }
    }

    private static void printout(int[] arr) {
        List<String> str = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            str.add(String.valueOf(arr[i]));
        }
        System.out.println(String.join(" ", str));
    }
}