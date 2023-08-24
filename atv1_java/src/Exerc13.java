import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double notaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.println("Sua média final é: " + notaFinal);
        scanner.close();
    }
}