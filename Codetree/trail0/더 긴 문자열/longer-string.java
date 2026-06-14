import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        sc.close();

        int word1ln = word1.length();
        int word2ln = word2.length();
        if(word1ln == word2ln){
            System.out.print("same");
        }else if(word1ln > word2ln){
            System.out.print(word1 +  " " + word1ln);
        }else{
            System.out.print(word2 +  " " + word2ln);
        }
    }
}