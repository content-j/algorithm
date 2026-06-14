import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int sum = 0;
        for(int i = a; b >= i; i++){
            if(i % 2 == 0){
                sum+=i;
            }
        }
        System.out.print(sum);

    }
}