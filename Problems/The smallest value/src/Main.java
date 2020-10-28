import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long threshold = s.nextLong();
        int count = 1;
        long factNum = 0;
        int result = 1;
        while (factNum <= threshold) {
            factNum = fact(count);
            // System.out.println(factNum);
            result = count;
            count++;
        }
        System.out.print(result);
    }

    public static long fact(int n) {
        if (n <= 1)
            return n;
        else
            return fact(n-1) * n;
    }
}