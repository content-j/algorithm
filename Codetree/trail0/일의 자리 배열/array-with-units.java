import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        sc.close();

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        for(int i = 2; 10 > i; i++){
            arr[i] = clac(arr[i-2], arr[i-1] );
            System.out.print(arr[i]+ " ");
        }

    }
    public static int clac(int a, int b){
        int sum = a + b;
        if(sum > 9){
            sum%=10;
        }
        return  sum;
    }
}