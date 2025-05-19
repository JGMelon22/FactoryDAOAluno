import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDAO {

    private final Connection conexao;

    public AlunoDAO() throws SQLException {
        this.conexao = ConnectionFactory.criaConexao();
    }

    public Aluno buscaAluno(int idmatricula) throws SQLException, AlunoNaoEncontradoException {
        Aluno aluno = null;

        String sql = "SELECT * FROM aluno WHERE matricula = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, idmatricula);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            aluno = new Aluno(
                    resultSet.getInt("idaluno"),
                    resultSet.getInt("matricula"),
                    resultSet.getString("nome")
            );
        } else {
            throw new AlunoNaoEncontradoException(idmatricula);
        }

        return aluno;
    }
}
