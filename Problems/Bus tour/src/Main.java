import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int busHeight = s.nextInt();
        int bridges = s.nextInt();
        int crash = 0;
        for (int i = 1; i <= bridges; i++) {
            int bridgeHeight = s.nextInt();
            if (busHeight >= bridgeHeight) {
                crash = i;
                break;
            }
        }

        if (crash == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crash);
        }
    }
}