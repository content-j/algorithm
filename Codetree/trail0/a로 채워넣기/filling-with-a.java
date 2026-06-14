import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int ln = str.length();
        System.out.print(
            str.substring(0, 1)
            +"a"
            + str.substring(2, ln -2)
            +"a"
            + str.substring(ln-1)
        );

    }
}