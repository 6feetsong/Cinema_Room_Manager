import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        int prev = arr[0];
        for (int num: arr) {
            if (num >= prev) {
                prev = num;
                continue;
            } else {
                prev = -1;
                break;
            }
        }
        System.out.println(prev != -1);
    }
}