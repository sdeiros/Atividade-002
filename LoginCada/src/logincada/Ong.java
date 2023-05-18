/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logincada;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "ong", catalog = "novasraizes", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ong.findAll", query = "SELECT o FROM Ong o"),
    @NamedQuery(name = "Ong.findById", query = "SELECT o FROM Ong o WHERE o.id = :id"),
    @NamedQuery(name = "Ong.findByNomeong", query = "SELECT o FROM Ong o WHERE o.nomeong = :nomeong"),
    @NamedQuery(name = "Ong.findByEndere\u00e7o", query = "SELECT o FROM Ong o WHERE o.endere\u00e7o = :endere\u00e7o"),
    @NamedQuery(name = "Ong.findByTelefone", query = "SELECT o FROM Ong o WHERE o.telefone = :telefone"),
    @NamedQuery(name = "Ong.findByEmail", query = "SELECT o FROM Ong o WHERE o.email = :email")})
public class Ong implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nomeong")
    private String nomeong;
    @Basic(optional = false)
    @Column(name = "endere\u00e7o")
    private String endereço;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Ong() {
    }

    public Ong(Integer id) {
        this.id = id;
    }

    public Ong(Integer id, String nomeong, String endereço, String telefone, String email) {
        this.id = id;
        this.nomeong = nomeong;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomeong() {
        return nomeong;
    }

    public void setNomeong(String nomeong) {
        String oldNomeong = this.nomeong;
        this.nomeong = nomeong;
        changeSupport.firePropertyChange("nomeong", oldNomeong, nomeong);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        String oldEndereço = this.endereço;
        this.endereço = endereço;
        changeSupport.firePropertyChange("endere\u00e7o", oldEndereço, endereço);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ong)) {
            return false;
        }
        Ong other = (Ong) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logincada.Ong[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
