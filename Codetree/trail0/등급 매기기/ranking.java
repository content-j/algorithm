import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String result = "F";
        if(n >=90){
            result = "A";
        }else if(n >= 80){
            result = "B";
        }else if(n >= 70){
            result = "C";
        }else if(n >= 60){
            result = "D";
        }
        System.out.print(result);
    }
}