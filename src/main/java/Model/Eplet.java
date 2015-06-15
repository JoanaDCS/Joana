package Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="EPLET")
public class Eplet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4224830098014827037L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EPT_ID")
	private long id;
	@Column(name="EPT_DESCRICAO", nullable=false)
	private String nome;
	@Column(name="EPT_MARCADO", length=2, nullable=false)
	private int marcado;
	@Column(name="EPT_COR", nullable=false, length=2)
	private int cor;
	@ManyToMany(mappedBy="eplets")
	private List<Alelo> alelos;
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
	public int getMarcado() {
		return marcado;
	}
	public void setMarcado(int marcado) {
		this.marcado = marcado;
	}
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public List<Alelo> getAlelos() {
		return alelos;
	}
	public void setAlelos(List<Alelo> alelos) {
		this.alelos = alelos;
	}
	
	
	

}
