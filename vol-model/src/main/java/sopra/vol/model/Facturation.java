package sopra.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name ="facturation")

public class Facturation {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String numeroFacturation;
	private ModeDePaiement modeDePaiement;
	private Date dateFacture;
	@OneToMany (mappedBy = "facturation")
	private List<Reservation> reservations = new ArrayList<>();

	public Facturation() {
		super();
	}

	public Facturation(String numeroFacturation, ModeDePaiement modeDePaiement, Date dateFacture) {
		super();
		this.numeroFacturation = numeroFacturation;
		this.modeDePaiement = modeDePaiement;
		this.dateFacture = dateFacture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroFacturation() {
		return numeroFacturation;
	}

	public void setNumeroFacturation(String numeroFacturation) {
		this.numeroFacturation = numeroFacturation;
	}

	public ModeDePaiement getModeDePaiement() {
		return modeDePaiement;
	}

	public void setModeDePaiement(ModeDePaiement modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
