import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2023;
        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            System.out.println("Você não pode votar!");
        } else {
            System.out.println("Você pode votar!");
        }
        scanner.close();
    }
}