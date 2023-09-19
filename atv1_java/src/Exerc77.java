import java.util.ArrayList;
import java.util.List;

public class Exerc77 {
    //Usando Array ou Vetor
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8};
        
        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }
        
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}

class Exerc77_2 {
    // Usando lista
    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        
        for (int i = 8; i >= 5; i--) {
            int aux = v.get(i);
            v.set(i, v.get(8 - i + 1));
            v.set(8 - i + 1, aux);
        }
        
        v.set(3, v.get(1));
        v.set(v.get(3), v.get(v.get(2)));
        
        // Mostra o conteúdo da lista V
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}