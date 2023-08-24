import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número aleatório: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número aleatório: ");
        double num2 = scanner.nextDouble();

        if (num1 < num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }
        scanner.close();
    }
}