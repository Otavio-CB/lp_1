import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor atual do seu salário: ");
        double salario_atual = scanner.nextDouble();

        System.out.println("Digite o valor do reajuste: ");
        double reajuste = scanner.nextDouble();

        double resultado = salario_atual + ((reajuste / 100) * salario_atual);
        System.out.println(resultado);
        scanner.close();
    }
}