import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in); Connection conn = ConnectionFactory.criaConexao()) {

            // Criando instância do AlunoDAO
            AlunoDAO alunoDAO = new AlunoDAO();

            // Solicitando a matrícula do aluno
            System.out.print("Digite a matrícula do aluno: ");
            int matricula = scanner.nextInt();

            // Buscando o aluno no banco de dados
            Aluno aluno = alunoDAO.buscaAluno(matricula);

            // Exibindo as informações do aluno, caso encontrado
            System.out.println("Aluno encontrado:");
            System.out.println("ID: " + aluno.getIdaluno());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
        } catch (AlunoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro de banco de dados: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}