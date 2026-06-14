import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        int cnt = 0;
        for(int i = start; end >= i; i++){
            int divisor = 1;
            for(int j = 2; i >= j; j++){
                if(i % j ==0){
                    divisor++;
                }
            }
            if(divisor == 3){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}