package dao;
import factory.ConnectionFactory;
import modelo.ong;
import java.sql.*;
import java.sql.PreparedStatement;

public class OngdD {
    private Connection connection;
    Long id;
    String nomeong;
    String endereço;
    String email;
    String telefone;
    
    public OngdD(){
        this.connection = new ConnectionFactory().getConnection();
        
    }
    
    public void adiciona(ong ong){
        String sql = "INSERT INTO ong(nomeong,endereço,telefone,email) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, ong.getNomeong());
            stmt.setString(2, ong.getEndereço());
            stmt.setString(3, ong.getTelefoneong());
            stmt.setString(4, ong.getEmailong());
            stmt.execute();
            stmt.close();
            } catch (SQLException u) {
                throw new RuntimeException(u);
        }
    }
    
    
}

