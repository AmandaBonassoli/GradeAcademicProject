package br.com.gradeacademic.conectar;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBd {

	public static Connection conectar() {
		String url = "jdbc:postgresql://localhost/gradeacademic";
		String usuario = "postgres";
		String senha = "postgres";

		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			throw new RuntimeException("Erro na Conex�o: ", e);
		}

	}

	public static void desconectar(Connection conexao) {
		try {
			conexao.close();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao desconectar: ", e);
		}

	}

}
