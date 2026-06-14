import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int cnt = 0;
        for(int i = 1; n >= i; i++){
            if(i % 2 == 0){
                continue;
            }else if(i % 3 == 0){
                continue;
            }else if(i % 5 == 0){
                continue;
            }
            cnt++;
        }
        System.out.print(cnt);

    }
}