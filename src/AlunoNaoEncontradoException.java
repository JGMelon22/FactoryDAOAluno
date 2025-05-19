public class AlunoNaoEncontradoException extends Exception {

    public AlunoNaoEncontradoException(int matricula) {
        super("Aluno com matrícula " + matricula + " não foi encontrado.");
    }
}
