import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int threshold = s.nextInt();
        int val = 1;
        int result = 0;
        while ((val * val) <= threshold) {
            result = val * val;
            System.out.println(result);
            val++;
        }
    }
}