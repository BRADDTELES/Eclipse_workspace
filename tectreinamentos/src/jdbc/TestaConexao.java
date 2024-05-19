package jdbc;

public class TestaConexao {

	public static void main(String[] args) {

		try {

			new ConnectionFactory().getConnection();
			System.out.println("Base de dados conectada com Sucesso!");
			
		} catch (Exception erro) {

			System.out.println("Base de dados não conectada! "+erro);
		}

	}

}
