import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sexo: ");
        String sexo = scanner.next();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        if (sexo == "M") {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println(nome + "," + pesoIdeal);
        } else {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println(nome + pesoIdeal);
        }
        scanner.close();
    }
}