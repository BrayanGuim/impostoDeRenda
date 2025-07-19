import java.util.Scanner;

public class impostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda = sc.nextDouble();

        if (renda >= 0 && renda <= 2000.00) {
            System.out.println("Isento");
        }
        else if (renda > 2000.00 && renda <= 3000.00) {
            double taxa = (renda - 2000) * 0.08;
            System.out.printf("R$%.2f%n", taxa); 
        }
        else if (renda > 3000.00 && renda <= 4500.00) {
            double taxa = 1000.00 * 0.08 + (renda - 3000) * 0.18;
            System.out.printf("R$%.2f%n", taxa);
        }
        else if (renda > 4500.00) {
            double taxa = 1000.00 * 0.08 + 1500.00 * 0.18 + (renda - 4500.00) * 0.28;
            System.out.printf("R$%.2f%n", taxa);
        }
        sc.close();
    }
}