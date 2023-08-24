public class Restaurante {
    private String nome;
    private String tipoCozinha;
    private int capacidadeMaxima;

    public Restaurante(String nome, String tipoCozinha, int capacidadeMaxima) {
        this.nome = nome;
        this.tipoCozinha = tipoCozinha;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void abrir() {
        System.out.println(nome + " está aberto.");
    }
    public void fechar() {
        System.out.println(nome + " está fechado.");
    }
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Cozinha: " + tipoCozinha);
        System.out.println("Capacidade Máxima: " + capacidadeMaxima + " pessoas");
    }

    public String getNome() {
        return nome;
    }
    public String getTipoCozinha() {
        return tipoCozinha;
    }
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
}
