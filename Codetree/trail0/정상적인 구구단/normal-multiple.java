import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for(int i = 1; N >= i; i++){
            for(int j = 1; N >= j; j++){
                System.out.print(String.format("%d * %d = %d", i, j, (i * j)));
                if(N > j){
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }
    }
}