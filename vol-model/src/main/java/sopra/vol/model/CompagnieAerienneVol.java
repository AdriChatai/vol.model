package sopra.vol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="compagnie_aerienne_vol")
public class CompagnieAerienneVol {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@ManyToOne
	@JoinColumn (name = "compagnie_Aerienne_id")
	private CompagnieAerienne compagnieAerienne;
	@ManyToOne
	@JoinColumn (name ="vol_id")
	private Vol vol;
	private String numero;

	public CompagnieAerienneVol() {
		super();
	}

	public CompagnieAerienneVol(CompagnieAerienne compagnieAerienne, Vol vol) {
		super();
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}

	public CompagnieAerienneVol(CompagnieAerienne compagnieAerienne, Vol vol, String numero) {
		super();
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
