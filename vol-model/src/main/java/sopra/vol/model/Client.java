package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Client {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	@Embedded
	private Adresse adressse;
	@OneToMany (mappedBy = "client")
	private List<Reservation> reservations = new ArrayList<>();
	@Version
	private int version;

	public Client() {
		super();
	}

	public Client(String nom) {
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

	public Adresse getAdressse() {
		return adressse;
	}

	public void setAdressse(Adresse adressse) {
		this.adressse = adressse;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
