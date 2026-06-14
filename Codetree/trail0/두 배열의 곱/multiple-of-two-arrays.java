import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];

        for(int i = 0 ; 3 > i; i++){
            for(int j = 0; 3 > j; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; 3 > i; i++){
            for(int j = 0; 3 > j; j++){
                arr2[i][j] = sc.nextInt();
                System.out.print(String.format("%d ", (arr1[i][j] * arr2[i][j])));
            }
            System.out.println("");
        }

    }
}