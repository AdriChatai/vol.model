package Vol.test;

import javax.persistence.EntityManagerFactory;

import sopra.formation.Application;
import sopra.vol.model.Aeroport;
import sopra.vol.model.Ville;

public class TestAeroportVille {
	
	EntityManagerFactory emf = Application.getInstance().getEmf();	
	Aeroport aero1 = new Aeroport("CDG","Charles de Gaulle");
	Aeroport aero2 = new Aeroport("BOD","Merignac");
	Ville ville = new Ville("Bordeaux");
	Vol vol = new Vol()
	
	
}
