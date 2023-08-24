import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda avaliação: ");
        double nota2 = scanner.nextDouble();

        double totalMedia = (nota1 + nota2) / 2;

        if (totalMedia < 6) {
            System.out.println("Você está reprovado!");
        } else {
            System.out.println("Você está aprovado!");
        }
        scanner.close();
    }
}