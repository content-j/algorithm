import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int result1 = a < b ? 1 : 0;
        int result2 = a == b ? 1 : 0;
        System.out.print(String.format("%d %d", result1, result2));
    }
}