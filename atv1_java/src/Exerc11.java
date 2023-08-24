import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarroVendido = scanner.nextDouble();

        double comissaoPorCarro = numeroCarrosVendidos * valorPorCarroVendido;
        double comissaoPorVendas = 0.05 * valorTotalVendas;
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;

        System.out.println("O salário final do vendedor é: " + salarioFinal);

        scanner.close();
    }
}