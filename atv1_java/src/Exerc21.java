import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o horário de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.println("Digite o horário final do jogo: ");
        int horaFinal = scanner.nextInt();

        int totalHoras = horaFinal - horaInicio;

        System.out.println(totalHoras);
        scanner.close();
    }
}