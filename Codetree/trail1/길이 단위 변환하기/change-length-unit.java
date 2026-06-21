public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        double ft = 9.2;
        double mi = 1.3;
        System.out.println(String.format("%.1fft = %.1fcm", ft, (ft * 30.48)));
        System.out.print(String.format("%.1fmi = %.1fcm", mi, (mi * 160934.0)));
    }
}