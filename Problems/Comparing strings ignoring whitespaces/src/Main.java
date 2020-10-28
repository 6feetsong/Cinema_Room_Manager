import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine().trim().replace(" ", "");
        String str2 = s.nextLine().trim().replace(" ", "");
        System.out.println(str1.equals(str2));
    }
}