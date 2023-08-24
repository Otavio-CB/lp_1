public class Aluno {
    private int matricula;
    private String nome;
    private String instituicao;

    public Aluno(int matricula, String nome, String instituicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.instituicao = instituicao;
    }

    public void estudar() {
        System.out.println(nome + "Está estudando!");
    }
    public void apresntar() {
        System.out.println("Meu nome é " + nome + " e estudo na instituição " + instituicao);
    }
    public void fazerProva() {
        System.out.println("Depois de estudar, " + nome + " foi realizar uma prova!");
    }

    public String getNome() {
        return nome;
    }
    public String getInstituicao() {
        return instituicao;
    }
    public int getMatricula() {
        return matricula;
    }
}
