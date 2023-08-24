public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoMinutos;

    public Filme(String titulo, String diretor, int duracaoMinutos) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo o filme: " + titulo);
    }
    public void pausar() {
        System.out.println("Pausando o filme.");
    }
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
