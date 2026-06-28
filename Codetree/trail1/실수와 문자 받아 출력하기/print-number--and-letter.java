import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        System.out.print(String.format("%s\n%.2f\n%.2f", c, a, b));
    }
}