import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(getResult(a >= b));
        System.out.println(getResult(a > b));
        System.out.println(getResult(b >= a ));
        System.out.println(getResult(b > a));
        System.out.println(getResult(a == b));
        System.out.println(getResult(a != b));
    }

    public static int getResult(boolean flag){
        if(flag){
            return 1;
        }
        return 0;
    }
}