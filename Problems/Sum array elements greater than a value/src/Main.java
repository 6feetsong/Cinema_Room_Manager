import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrayLength = s.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int n = s.nextInt();
            arr[i] = n;
        }
        int threshold = s.nextInt();
        int result = 0;
        for (int num: arr) {
            if (num > threshold) {
                result += num;
            }
        }
        System.out.println(result);
    }
}