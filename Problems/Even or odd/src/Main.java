import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        while (true) {
            int num = s.nextInt();
            if (num == 0) break;
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}