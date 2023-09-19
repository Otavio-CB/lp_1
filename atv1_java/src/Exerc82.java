import java.util.ArrayList;
import java.util.List;

public class Exerc82 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int x = 2;
        int[] vetorM = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorM[i] = vetorA[i] * x;
        }

        System.out.print("Vetor M: ");
        for (int num : vetorM) {
            System.out.print(num + " ");
        }
    }
}

class Exerc82_2 {
    public static void main(String[] args) {
        List<Integer> vetorA = new ArrayList<>();
        vetorA.add(1);
        vetorA.add(2);
        vetorA.add(3);
        vetorA.add(4);
        vetorA.add(5);

        int x = 2;

        List<Integer> vetorM = new ArrayList<>();

        for (int i = 0; i < vetorA.size(); i++) {
            vetorM.add(vetorA.get(i) * x);
        }

        System.out.print("Vetor M: ");
        for (int num : vetorM) {
            System.out.print(num + " ");
        }
    }
}