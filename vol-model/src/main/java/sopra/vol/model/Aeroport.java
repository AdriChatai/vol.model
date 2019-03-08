package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name="aeroport")
public class Aeroport {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String code;
	private String nom;
	
	@ManyToMany
	@JoinTable(name = "aeroport_ville", joinColumns = @JoinColumn(name="ville_id",referencedColumnName="id"), 
	inverseJoinColumns=@JoinColumn(name="aeroport_id",referencedColumnName="id"))
	private List<Ville> villes = new ArrayList<>();

	public Aeroport() {
		super();
	}

	public Aeroport(String code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
