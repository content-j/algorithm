import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;
        for(int i = 0; 10 > i; i++){
            int tmp = sc.nextInt();
            if(tmp % 3 == 0){
                cnt3++;
            }
            if(tmp % 5 == 0){
                cnt5++;
            }
        }
        sc.close();
        System.out.print(cnt3 + " " + cnt5);

    }
}