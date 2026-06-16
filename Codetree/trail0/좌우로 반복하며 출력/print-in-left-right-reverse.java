import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; n > i; i++){
            int start = 0 ;
            int end = n;
            int sum = 0;
            int step = 1;
            if(i % 2 != 0){
                sum = n+1;
                step = -1;
            }
            for(int j = 0; n > j; j++){
                System.out.print(sum+=step);
            }
            System.out.println("");
        }
    }
}