public class Exerc2 {
    public static void main(String[] args) {
        /*Exercício A */
        short a = 10;
        short b = 20;
        System.out.println(b);
        b = 5;
        System.out.println(String.valueOf(a) + " e " + String.valueOf(b));
    }
}

class Exerc2_2 {
    public static void main(String[] args) {
        /*Exercício B */
        short a = 30;
        short b = 20;
        int c = a + b;
        System.out.println(c);
        b = 10;
        System.out.println(String.valueOf(b) + " e " + String.valueOf(c));
    }
}

class Exerc2_3 {
    /*Exercício C */
    public static void main(String[] args) {
        short a = 10;
        short b = 20;
        short c = a;
        b = c;
        a = b;
        System.out.println(String.valueOf(a) + ", " + String.valueOf(b) + " e " + String.valueOf(c));
    }
}

class Exerc2_4 {
    /*Exercício D*/
    public static void main(String[] args) {
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println(a);
        a = b + 1;
        System.out.println(String.valueOf(a) + " e " + String.valueOf(b));
    }
}

class Exerc2_5 {
    /*Exercício E*/
    public static void main(String[] args) {
        short a = 10;
        short b = 5;
        int c = a + b;
        b = 20;
        a = 10;
        System.out.println(String.valueOf(a) + ", " + String.valueOf(b) +  " e " + String.valueOf(c));
    }
}

class Exerc2_6 {
    /*Exercício F */
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println(z);
    }
}