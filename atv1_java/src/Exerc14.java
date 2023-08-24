import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número aleaório: ");
        double num = scanner.nextDouble();

        if (num < 10) {
            System.out.println("É menor que 10");
        } else if (num == 10) {
            System.out.println("É igual a 10");
        }
        else {
            System.out.println("É maior que 10");
        }
        scanner.close();
    }
}