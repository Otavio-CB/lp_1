public class Eletronico {
    private String nome;
    private String categoria;
    private double preco;

    public Eletronico(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public void ligar() {
        System.out.println("Ligando o " + nome);
    }
    public void desligar() {
        System.out.println("Desligando o " + nome);
    }
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: $" + preco);
    }

    public String getNome() {
        return nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getPreco() {
        return preco;
    }
}
