import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};

        System.out.print("Digite um número para verificar se está no vetor: ");
        int numeroVerificar = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroVerificar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroVerificar + " está no vetor.");
        } else {
            System.out.println("O número " + numeroVerificar + " não está no vetor.");
        }
        scanner.close();
    }
}

class Exerc88_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> vetor = new ArrayList<>();
        vetor.add(10);
        vetor.add(15);
        vetor.add(20);
        vetor.add(25);
        vetor.add(30);
        vetor.add(35);
        vetor.add(40);
        vetor.add(45);
        vetor.add(50);
        vetor.add(55);

        System.out.print("Digite um número para verificar se está na lista: ");
        int numeroVerificar = scanner.nextInt();

        if (vetor.contains(numeroVerificar)) {
            System.out.println("O número " + numeroVerificar + " está na lista.");
        } else {
            System.out.println("O número " + numeroVerificar + " não está na lista.");
        }
        scanner.close();
    }
}