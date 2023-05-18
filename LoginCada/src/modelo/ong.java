package modelo;

/**
 *
 * @author Fernando Moreira
 */
public class ong {
    Long id;     
    String nome;     
    String endereço;     
    String email;     
    String telefone;
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getEmailong() {
        return email;
    }
    public void setEmailong(String email) {
        this.email = email;
    }
    public Long getId() {
        return id;        
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeong() {
        return nome;
    }
    public void setNomeong(String nome) {
        this.nome = nome;
    }
    public String getTelefoneong() {
        return telefone;
    }
    public void setTelefoneong(String telefone) {
        this.telefone = telefone;
    }

    public void setcnpj(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setnomefornecedor(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
