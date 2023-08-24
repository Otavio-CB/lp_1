import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();

        double conversaoCelsius = (fahrenheit - 32) / 1.8;

        System.out.println(conversaoCelsius);
        scanner.close();
    }
}