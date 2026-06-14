import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        for(int i =0; 10 > i; i++){
            arr[i] = sc.next();
        }
        sc.close();
        
        for(int i = 10; i > 0; i--){
            System.out.print(arr[i-1]);
        }
        
    }
}