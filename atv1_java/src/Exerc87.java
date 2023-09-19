import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        int novoNumero;

        System.out.print("Digite um novo número a ser inserido: ");
        novoNumero = scanner.nextInt();

        int[] novoVetor = new int[vetor.length + 1];
        int posicaoInsercao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < novoNumero) {
                novoVetor[i] = vetor[i];
            } else {
                posicaoInsercao = i;
                break;
            }
        }

        novoVetor[posicaoInsercao] = novoNumero;

        for (int i = posicaoInsercao + 1; i < novoVetor.length; i++) {
            novoVetor[i] = vetor[i - 1];
        }

        System.out.print("Vetor com o novo número inserido e ordenado: ");
        for (int num : novoVetor) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

class Exerc87_2 {
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

        System.out.print("Digite um novo número a ser inserido: ");
        int novoNumero = scanner.nextInt();

        int posicaoInsercao = 0;
        for (int i = 0; i < vetor.size(); i++) {
            if (vetor.get(i) >= novoNumero) {
                posicaoInsercao = i;
                break;
            }
        }

        vetor.add(posicaoInsercao, novoNumero);

        System.out.print("Vetor com o novo número inserido e ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}