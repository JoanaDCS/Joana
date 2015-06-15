package Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITERACAO")
public class Iteracao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7223673015706471503L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IT_ID")
	private long id;
	@Column(name="IT_DATA_ACESSO", nullable=false)
	private Date data_acesso;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getData_acesso() {
		return data_acesso;
	}
	public void setData_acesso(Date data_acesso) {
		this.data_acesso = data_acesso;
	}
	
	
	
}
