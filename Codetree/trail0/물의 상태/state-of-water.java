import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int water = sc.nextInt();
        sc.close();
        String message = "water";

        if(0 > water){
            message = "ice";
        }else if(water > 99){
            message = "vapor";
        }
        System.out.print(message);

    }
}