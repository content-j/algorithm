import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int ln = 1;
        for(int i = 1; n >= i; i++){
            for(int j = 0; ln > j; j++){
                System.out.print("*");
            }
            ln+=2;
            System.out.println();
        }
    }
}