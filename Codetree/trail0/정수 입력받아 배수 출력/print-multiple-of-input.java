import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i =1; 5 >= i; i++){
            System.out.print((n * i) + " ");

        }
    }
}