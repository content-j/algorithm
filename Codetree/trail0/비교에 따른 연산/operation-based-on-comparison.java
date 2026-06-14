import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int result = a * b;
        if(a <= b){
            result = b / a;
        }

        System.out.print(result);
    }
}