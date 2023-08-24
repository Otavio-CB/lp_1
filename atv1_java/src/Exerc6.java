import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        float base = scanner.nextFloat();

        System.out.println("Digite o valor da altura: ");
        float altura = scanner.nextFloat();

        float result = base * altura;
        System.out.println(result);
        scanner.close();
    }
}