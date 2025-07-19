import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int n = 1;

        for (int i = 1; i < N; i++) { 
            if (i < N && (N - i) > 1) {
                n *= (N - i);
            } 
            else {
                int factorial = N * n;
                System.out.println(factorial);
            }
        }
        
        if (N == 0 || N == 1) System.out.println(1);

        sc.close();
    }
}