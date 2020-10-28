import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = result + "Fizz";
            }

            if (i % 5 ==0) {
                result = result + "Buzz";
            }

            if (result.length() > 0) {
                System.out.println(result);
            } else {
                System.out.println(i);
            }
        }
    }
}