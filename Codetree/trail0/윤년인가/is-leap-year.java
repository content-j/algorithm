import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if(year % 4 == 0){
            if(!(year % 100 == 0 && year % 400 != 0)){
                System.out.print(true);
            }else{
                System.out.print(false);
            }
        }else{
            System.out.print(false);
        }
        
        
    }
}