import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         sc.close();

        int sum = a + b;
        float avg = (float)sum / 2;
        System.out.print(String.format("%d %.1f", sum, avg));

       
    }
}