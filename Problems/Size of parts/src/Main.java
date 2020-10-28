import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] result = new int[3];

        for (int i = 0; i < length; i++) {
            int num = s.nextInt();
            if (num == 1) {
                result[1]++;
            } else if (num == -1) {
                result[2]++;
            } else {
                result[0]++;
            }
        }

        List<String> str = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            str.add(String.valueOf(result[i]));
        }
        System.out.println(String.join(" ", str));
    }
}