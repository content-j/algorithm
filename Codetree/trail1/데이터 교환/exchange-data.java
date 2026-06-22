public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;
        int tmpB = b;
        b = a;
        a = c;
        c = tmpB;
        
        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}