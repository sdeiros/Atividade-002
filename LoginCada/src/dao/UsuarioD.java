package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioD {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    
    public UsuarioD(){
        this.connection = new ConnectionFactory().getConnection();
        
    }
    
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario(naturalidade,nome,email,senha) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.execute();
            stmt.close();
            } catch (SQLException u) {
                throw new RuntimeException(u);
        }
    }
    
    
}
