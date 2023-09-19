import java.util.ArrayList;
import java.util.List;

public class Exerc81 {
    public static void main(String[] args) {
        int[] vetor = {5, 10, 2, 8, 1};

        int menorElemento = vetor[0];
        int posicaoMenorElemento = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
                posicaoMenorElemento = i;
            }
        }

        System.out.println("Menor elemento: " + menorElemento);
        System.out.println("Posição do menor elemento: " + posicaoMenorElemento);
    }
}

class Exerc81_2 {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        vetor.add(5);
        vetor.add(10);
        vetor.add(2);
        vetor.add(8);
        vetor.add(1);

        int menorElemento = vetor.get(0);
        int posicaoMenorElemento = 0;

        for (int i = 1; i < vetor.size(); i++) {
            if (vetor.get(i) < menorElemento) {
                menorElemento = vetor.get(i);
                posicaoMenorElemento = i;
            }
        }

        System.out.println("Menor elemento: " + menorElemento);
        System.out.println("Posição do menor elemento: " + posicaoMenorElemento);
    }
}