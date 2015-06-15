package Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ALELO")
public class Alelo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4523338668062641735L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ALE_ID")
	private int id;
	@Column(name="ALE_MFI", nullable=false)
	private int mfi;
	@Column(name="ALE_DESCRICAO", nullable=false, length=10)
	private String nome;
	@ManyToMany
	@JoinTable(name = "ALELO_EPLET")
	private List<Eplet> eplets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMfi() {
		return mfi;
	}
	public void setMfi(int mfi) {
		this.mfi = mfi;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Eplet> getEplets() {
		return eplets;
	}
	public void setEplets(List<Eplet> eplets) {
		this.eplets = eplets;
	}
	
	
	
}
