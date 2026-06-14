import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(25 ==n){
                System.out.println("Good");
                sc.close();
               break; 
            }else if(n < 25){
                System.out.println("Higher");
            }else {
                System.out.println("Lower");
            }
        }
    }
}