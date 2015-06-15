package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANALISE")
public class Analise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7973433842115511129L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ANALISE_ID")
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
