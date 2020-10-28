import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long val1 = s.nextLong();
        String operator = s.next();
        long val2 = s.nextLong();

        switch (operator) {
            case "+":
                System.out.println(val1 + val2);
                break;
            case "-":
                System.out.println(val1 - val2);
                break;
            case "/":
                if (val2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(val1 / val2);
                }
                break;
            case "*":
                System.out.println(val1 * val2);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}