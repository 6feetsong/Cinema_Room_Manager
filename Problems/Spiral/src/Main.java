import java.util.*;

class Main {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int dim = s.nextInt();
        int maxRight = dim - 1;
        int maxDown = dim - 1;
        int maxLeft = 0;
        int maxUp = 1;
        int[][] result = new int[dim][dim];

        int x = 0;
        int y = 0;
        String dir = "Right";

        for (int i = 1; i <= (dim * dim); i++) {

            result[y][x] = i;

            if (dir == "Right") {
                if (x == maxRight) {
                    maxRight--;
                    dir = "Down";
                    y++;
                } else {
                    x++;
                }
            } else if (dir == "Down") {
                if (y == maxDown) {
                    maxDown--;
                    dir = "Left";
                    x--;
                } else {
                    y++;
                }
            } else if (dir == "Left") {
                if (x == maxLeft) {
                    maxLeft++;
                    dir = "Up";
                    y--;
                } else {
                    x--;
                }
            } else if (dir == "Up") {
                if (y == maxUp) {
                    maxUp++;
                    dir = "Right";
                    x++;
                } else {
                    y--;
                }
            }
        }

        for (int i = 0; i < dim; i++) {
            printout(result[i]);
        }
    }

    private static void printout(int[] arr) {
        List<String> str = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            str.add(String.valueOf(arr[i]));
        }
        System.out.println(String.join(" ", str));
    }
}