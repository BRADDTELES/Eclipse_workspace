package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import jdbc.ConnectionFactory;
import model.Curso;

public class CursoDao {
	// conexão com a base de dados
	private Connection con;

	public CursoDao() {
		this.con = new ConnectionFactory().getConnection();
	}

	// método para inserir informações na base de dados
	public void inserir(Curso curso) {

		String sql = "insert into cursos (curso, nivel, duracao) values" + "(?, ?, ?)";

		try {

			PreparedStatement stmt = this.con.prepareStatement(sql);

			stmt.setString(1, curso.getCurso());
			stmt.setString(2, curso.getNivel());
			stmt.setInt(3, curso.getDuracao());

			stmt.execute();

			JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha na operação " + erro);
		}

	}

	//método Consultar
	public Curso getCurso(int id) {

		String sql = "select * from cursos where id=?";

		try {

			PreparedStatement stmt = this.con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			// vamos pegar a variavel RS (ResultSet) e passar para a variavel curso

			Curso curso = new Curso();

			rs.first();
			curso.setId(id);
			curso.setCurso(rs.getString("curso"));
			curso.setNivel(rs.getString("nivel"));
			curso.setDuracao(rs.getInt("duracao"));

			return curso;
		} catch (Exception erro) {

			return null;
		}
	}

	// método editar (Update)
	public void editar(Curso curso) {

		String sql = "update cursos set curso=?, nivel=?, duracao=? where id=?";

		try {

			PreparedStatement stmt = this.con.prepareStatement(sql);

			stmt.setString(1, curso.getCurso());
			stmt.setString(2, curso.getNivel());
			stmt.setInt(3, curso.getDuracao());
			stmt.setInt(4, curso.getId());

			stmt.execute();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao editar dados " + erro);
		}
	}
	
	//método excluir
	public void excluir (int id) {
		
		String sql = "delete from cursos where id=?";
		
		try {

			PreparedStatement stmt = this.con.prepareStatement(sql);

			stmt.setInt(1, id);

			stmt.execute();

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao excluir dados " + erro);
		}
	}
}
