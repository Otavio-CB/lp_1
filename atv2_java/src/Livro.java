public class Livro {
    private int anoPublicacao;
    private String nomeAutor;
    private String nomeLivro;

    public Livro(int anoPublicacao, String nomeAutor, String nomeLivro) {
        this.anoPublicacao = anoPublicacao;
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
    }

    public void mostrarStatus() {
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Título do Livro: " + nomeLivro);
    }
    public void emprestar() {
        System.out.println("Livro Emprestado!");
    }
    public void devolver() {
        System.out.println("Livro Devolvido!");
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
}
