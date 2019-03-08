package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

	@Embeddable
public class Adresse {
	@Column(name="rue", length = 100)
	private String rue;
	@Column(name="codePostal", length = 100)
	private String codePostal;
	@Column(name="ville", length = 100)
	private String ville;
	@Column(name="pays", length = 100)
	private String pays;

	public Adresse() {
		super();
	}

	public Adresse(String rue, String codePostal, String ville, String pays) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}
