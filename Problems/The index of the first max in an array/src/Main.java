import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int maximum = 0;
        int maximumIndex = 0;
        for (int i = 0; i < length; i++) {
            int num = s.nextInt();
            if (num > maximum) {
                maximum = num;
                maximumIndex = i;
            }
        }
        System.out.println(maximumIndex);
    }
}