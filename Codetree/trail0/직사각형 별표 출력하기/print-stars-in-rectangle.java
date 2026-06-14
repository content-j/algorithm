import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        for(int i = 0; n > i; i++){
            for(int j = 0; m > j; j++){
                System.out. print("* ");
            }
            System.out.println("");
        }
    }
}