import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int horasPorSemana = 40;
        final int semanasPorMes = 4;
        final double taxaHoraExtra = 1.5;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        double salarioTotal;

        if (horasTrabalhadas <= horasPorSemana * semanasPorMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            double horasExtras = horasTrabalhadas - (horasPorSemana * semanasPorMes);
            double salarioRegular = horasPorSemana * semanasPorMes * salarioPorHora;
            double salarioHoraExtra = horasExtras * salarioPorHora * taxaHoraExtra;
            salarioTotal = salarioRegular + salarioHoraExtra;
        }

        System.out.println("O salário total do funcionário é: " + salarioTotal);

        scanner.close();
    }
}
