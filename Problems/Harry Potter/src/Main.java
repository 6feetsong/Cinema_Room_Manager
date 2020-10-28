import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        switch (str) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }
    }
}