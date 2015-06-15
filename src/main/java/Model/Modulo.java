package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MODULO")
public class Modulo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4199380295989476913L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="MOD_ID")
	private long id;
	@Column(name="MOD_NOME", nullable=false, length=100)
	private String nome;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}