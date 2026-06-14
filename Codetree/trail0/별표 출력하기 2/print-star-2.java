import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = n; i > 0; i--){
            for( int j = 0; i > j ; j ++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}