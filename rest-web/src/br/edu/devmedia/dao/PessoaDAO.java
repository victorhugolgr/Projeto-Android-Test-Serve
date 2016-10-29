package br.edu.devmedia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.devmedia.config.DataBaseConfig;
import br.edu.devmedia.uitl.CriptoUtil;

public class PessoaDAO {
	
	public boolean isLoggedIn(String usuario, String senha) throws SQLException{
		Connection conexao = DataBaseConfig.getInstance().getConnetion();
		
		String sql = "SELECT * FROM TB_USUARIO WHERE USUARIO = ? AND SENHA = ?";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		
		statement.setString(1, usuario);
		statement.setString(2, CriptoUtil.criptoStringHexMD5(senha));
		
		ResultSet resultSet = statement.executeQuery();
		
		return resultSet.next();
	}
	
/*	public static void main(String[] args) throws SQLException {
		System.out.println(new PessoaDAO().isLoggedIn("admin", "admin"));
	}*/
	
}
