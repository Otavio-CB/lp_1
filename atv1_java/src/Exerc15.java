import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número aleatório: ");
        double num = scanner.nextDouble();

        if (num >= 0) {
            System.out.println("Valor positivo");
        } else {
            System.out.println("Valor negativo");
        }
        scanner.close();
    }
}