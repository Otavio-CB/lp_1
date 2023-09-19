import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exerc86 {
    public static void main(String[] args) {
        int[] vetor = {10, 5, 8, 12, 6, 15, 20, 7, 9, 18};

        Arrays.sort(vetor);

        System.out.print("Vetor ordenado em ordem crescente: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

class Exerc86_2 {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        vetor.add(10);
        vetor.add(5);
        vetor.add(8);
        vetor.add(12);
        vetor.add(6);
        vetor.add(15);
        vetor.add(20);
        vetor.add(7);
        vetor.add(9);
        vetor.add(18);

        Collections.sort(vetor);

        System.out.print("Vetor ordenado em ordem crescente: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}