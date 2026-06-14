import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List arr = new ArrayList();
    
        for(int i = 0; n > i; i++){
            int tmp = sc.nextInt();
            if(tmp % 2 == 0){
                arr.add(tmp);
            }    
        }
        sc.close();

        for(int i = arr.size(); i > 0; i--){
            System.out.print(arr.get(i-1) + " ");
        }
    }
}