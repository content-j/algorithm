import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        while(true){
             System.out.print(a + " ");
            if(a % 2 == 0){
                a+=3;
            }else{
                a*=2;
            }
            if(b < a){   
                break;
            }
        }
    }
}