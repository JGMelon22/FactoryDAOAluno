public class Aluno {

    private int idaluno;
    private int matricula;
    private String nome;

    public Aluno() {
    }

    public Aluno(int idaluno, int matricula, String nome) {
        this.idaluno = idaluno;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
