import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String shape = s.next();
        switch (shape) {
            case "triangle":
                double a = s.nextDouble();
                double b = s.nextDouble();
                double c = s.nextDouble();
                double p = (a + b + c) / 2;
                double area2 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area2);
                break;
            case "rectangle":
                double w = s.nextDouble();
                double h = s.nextDouble();
                double area = w * h;
                System.out.println(area);
                break;
            case "circle":
                double r = s.nextDouble();
                System.out.println(r * r * 3.14);
                break;
        }
    }
}