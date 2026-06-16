import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; 4 > i; i++){
            for(int j = 0; 4 > j; j++){
                int n = sc.nextInt();
                if(i >= j){
                    sum+= n;
                }
            }
        }
        System.out.print(sum);
    }
}