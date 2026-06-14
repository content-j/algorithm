import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        for(int i =0; n > i; i++){
            a+=n;
            System.out.println(a);
        }

    }
}