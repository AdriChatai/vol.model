package sopra.formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-vol");
	private final IAdresseDao adresseDao = new AdresseDaoJpa();
	private final IAeroportDao aeroportDao = new AeroportDaoJpa();
	private final IClientDao clientDao = new ClientDaoJpa();
	private final ICompagnieAerienneDao compagnieAerienneDao = new CompagnieAerienneDaoJpa();
	private final ICompagnieAerienneVolDao compagnieAerienneVolDao = new CompagnieAerienneVolDaoJpa();
	private final IEscaleDao escaleDao = new EscaleDaoJpa();
	private final IFacturationDao facturationDao = new FacturationDaoJpa();
	private final IPassagerDao passagerDao = new PassagerDaoJpa();
	private final IReservationDao reservationDao = new ReservationDaoJpa();
	private final IVilleDao villeDao = new VilleDaoJpa();
	private final IVolDao volDao = new VolDaoJpa();
	

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}
		return instance;
	}
	
	public EntityManagerFactory getEmf() {
		return emf;
	}
	
	public IAdresseDao getAdresseDao() {
		return adresseDao;
	}

	public IAeroportDao getAeroportDao() {
		return aeroportDao;
	}

	public IClientDao getClientDao() {
		return clientDao;
	}

	public ICompagnieAerienneDao getCompagnieAerienneDao() {
		return compagnieAerienneDao;
	}

	public ICompagnieAerienneVolDao getCompagnieAerienneVolDao() {
		return compagnieAerienneVolDao;
	}

	public IEscaleDao getEscaleDao() {
		return escaleDao;
	}

	public IFacturationDao getFacturationDao() {
		return facturationDao;
	}

	public IPassagerDao getPassagerDao() {
		return passagerDao;
	}

	public IReservationDao getReservationDao() {
		return reservationDao;
	}

	public IVilleDao getVilleDao() {
		return villeDao;
	}

	public IVolDao getVolDao() {
		return volDao;
	}

}