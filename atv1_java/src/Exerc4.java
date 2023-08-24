public class Exerc4 {
    public static void main(String[] args) {
        int a = 6 * (3 + 2);
        int b = 2 + 6 * (3 + 2);
        int c = 2 + 3 * 6 / (2 + 4);
        int d = 2 * (8 / (3 + 1));
        int e = 3 + (16 - 2) / (2 * (9 - 2));
        int f = 6 / 3 + 8 / 2;
        int g = (3 + 8 / 2) * 4 + 3 * 2;
        int h = 6 * 3 * 3 + 6 - 10;
        int i = (10 * 8 + 3) * 9;
        int j = -12 * -4 + 3 * -4;

        int[] results = {a, b, c, d, e, f, g, h, i, j};

        for (int result: results) {
            System.out.println(result);
        }
    }
}