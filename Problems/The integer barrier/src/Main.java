import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = 0;
        while (true) {
            int num = s.nextInt();
            if (num == 0) break;
            val += num;
            if (val >= 1000) {
                val = val - 1000;
                break;
            }
        }
        System.out.println(val);
    }
}