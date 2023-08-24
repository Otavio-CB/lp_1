public class Pessoa {
    private String nome;
    private int idade;
    private char genero;

    public Pessoa(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;

    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }
    public boolean isAdulto() {
        return idade >= 18;
    }
    public void cumprimentar() {
        System.out.println("Olá, eu sou " + nome + "!");
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public char getGenero() {
        return genero;
    }
}
