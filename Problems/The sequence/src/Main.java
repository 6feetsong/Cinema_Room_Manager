import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int max = 0;
        while (i > 0) {
            int num = s.nextInt();
            if (num % 4 == 0) {
//                System.out.println(i);
//                System.out.println(num);
                if (num > max) {
                    max = num;
                }
            }
            i--;
        }
        System.out.println(max);
    }
}