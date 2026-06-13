import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; n > i; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for(int j = a; b >= j; j++){
                if(j % 2 == 0){
                    sum+=j;
                }

            }

            System.out.println(sum);
        }
        sc.close();
    }
}