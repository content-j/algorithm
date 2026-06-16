import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zeroToN = n + 1;
        
        for(int i = 0; n > i; i++){
            int init = zeroToN - (i + 1);
            int step = zeroToN;
            for(int j = 0; n > j; j++){
                step*= -1;
                init = init + (step);
                int tmp = init;
                if(1 > tmp ){
                    tmp*= -1;
                }
                System.out.print(tmp);
            }
            System.out.println("");
        }
    }
}