import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[12];
        double soma = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;

        System.out.println("Digite a temperatura média de cada mês:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura do mês " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();

            soma += temperaturas[i];

            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }

            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        double mediaAnual = soma / 12;

        int diasAbaixoMedia = 0;
        for (double temperatura : temperaturas) {
            if (temperatura < mediaAnual) {
                diasAbaixoMedia++;
            }
        }

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Dias no ano em que a temperatura foi inferior à média anual: " + diasAbaixoMedia);
        scanner.close();
    }
}

class Exerc85_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();
        double soma = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;

        System.out.println("Digite a temperatura média de cada mês:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura do mês " + (i + 1) + ": ");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);

            soma += temperatura;

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }

        double mediaAnual = soma / 12;

        int diasAbaixoMedia = 0;
        for (double temperatura : temperaturas) {
            if (temperatura < mediaAnual) {
                diasAbaixoMedia++;
            }
        }

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Dias no ano em que a temperatura foi inferior à média anual: " + diasAbaixoMedia);
        scanner.close();
    }
}