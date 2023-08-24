import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de votos brancos: ");
        double votosBrancos = scanner.nextDouble();

        System.out.print("Digite o número de votos nulos: ");
        double votosNulos = scanner.nextDouble();

        System.out.print("Digite o número de votos válidos: ");
        double votosValidos = scanner.nextDouble();

        double totalEleitores = votosBrancos + votosNulos + votosValidos;

        double percentualBrancos = (votosBrancos / totalEleitores) * 100;
        double percentualNulos = (votosNulos / totalEleitores) * 100;
        double percentualValidos = (votosValidos / totalEleitores) * 100;

        System.out.println(percentualBrancos);
        System.out.println(percentualNulos);
        System.out.println(percentualValidos);
        scanner.close();
    }
}