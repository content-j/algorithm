import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;
        int cnt = 0;
        for(int i = 1; 100 >= i; i++){
            sum+=i;
            cnt++;
            if(sum >= n){
                break;
            }
        }

        System.out.print(cnt);
    }
}