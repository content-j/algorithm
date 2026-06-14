import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        String txt = sc.next();
        sc.close();

        int cnt = 0;
        for(int i = 0; arr.length > i; i++){
            String tmp = arr[i];
            if(tmp.substring(2, 3).equals(txt) || tmp.substring(3, 4).equals(txt)){
                System.out.println(tmp);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}