import java.util.*;

class Main {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int dim = s.nextInt();
        int c = (dim / 2);
        String[][] twoDimArray = new String[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                int d1 = Math.abs(i - c);
                int d2 = Math.abs(j - c);
                twoDimArray[i][j] = (d1 == 0 || d2 == 0 || d2 == d1) ? "*" : ".";
            }
            System.out.println(String.join(" ", Arrays.asList(twoDimArray[i])));
        }
    }
}