import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; n > i; i++){
            arr[i] = square(sc.nextInt());
            System.out.print(arr[i]+" ");
        }

    }

    public static int square(int vlu){        
        return vlu * vlu;
    }
}