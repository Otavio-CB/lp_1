import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;

        double custoConsumidor = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println(custoConsumidor);
        scanner.close();
    }
}