package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="compagnie_aerienne")
public class CompagnieAerienne {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	@OneToMany (mappedBy = "compagnieAerienne")
	private List<CompagnieAerienneVol> vols = new ArrayList<>();

	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(String nom) {
		super();
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
}
