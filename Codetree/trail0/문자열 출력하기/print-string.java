import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String text = "LeebrosCode";
        for(int i = 0; n > i; i++){
            System.out.println(text);
        }
    }
}