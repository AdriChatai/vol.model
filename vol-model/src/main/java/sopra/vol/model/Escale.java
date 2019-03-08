package sopra.vol.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="escale")
public class Escale {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@ManyToOne
	@JoinColumn(name="vol_id")
	private Vol vol;
	@ManyToOne
	@JoinColumn(name="aeroport_id")
	private Aeroport aeroport;
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@Temporal(TemporalType.DATE)
	private Date dateDepart;

	public Escale() {
		super();
	}

	public Escale(Vol vol, Aeroport aeroport) {
		super();
		this.vol = vol;
		this.aeroport = aeroport;
	}

	public Escale(Vol vol, Aeroport aeroport, Date dateArrivee, Date dateDepart) {
		super();
		this.vol = vol;
		this.aeroport = aeroport;
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

}
