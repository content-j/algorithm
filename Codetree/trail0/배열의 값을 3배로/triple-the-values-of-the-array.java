import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        for(int i = 0; 3 > i; i++){
            for(int j = 0; 3 > j; j++){
                arr[i][j] = (sc.nextInt() * 3);
                System.out.print(String.format("%d ", arr[i][j]));
            }
            System.out.println("");
        }
        
    }
}