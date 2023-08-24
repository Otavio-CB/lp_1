import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int anos = scanner.nextInt();

        System.out.println("Digite o mês: ");
        int meses = scanner.nextInt();

        System.out.println("Digite o dia: ");
        int dias = scanner.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 12) + dias;

        System.out.println("A idade expressa em dias é: " + idadeEmDias);
        scanner.close();
    }
}