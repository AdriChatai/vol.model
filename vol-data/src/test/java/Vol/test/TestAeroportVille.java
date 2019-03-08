package Vol.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManagerFactory;

import sopra.formation.Application;
import sopra.vol.model.Aeroport;
import sopra.vol.model.CompagnieAerienne;
import sopra.vol.model.CompagnieAerienneVol;
import sopra.vol.model.Ville;
import sopra.vol.model.Vol;

public class TestAeroportVille {

	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Application.getInstance().getEmf();
		Aeroport aero1 = new Aeroport("CDG", "Charles de Gaulle");
		Aeroport aero2 = new Aeroport("BOD", "Merignac");
		Ville ville = new Ville("Bordeaux");
		Vol vol = new Vol(true, new SimpleDateFormat("dd/MM/yyyy").parse("08/03/2019"),
				new SimpleDateFormat("dd/MM/yyyy").parse("09/03/2019"), 1000f);
		CompagnieAerienne ca = new CompagnieAerienne("AirFrance");
		CompagnieAerienneVol cav = new CompagnieAerienneVol();
		
		
		ville=Application.getInstance().getVilleDao().save(ville);
		aero1.addVilles(ville);
		aero1=Application.getInstance().getAeroportDao().save(aero1);
		aero2=Application.getInstance().getAeroportDao().save(aero2);
		vol.setDepart(aero1);
		vol.setArrivee(aero2);
		vol=Application.getInstance().getVolDao().save(vol);
		ca=Application.getInstance().getCompagnieAerienneDao().save(ca);
		cav.setVol(vol);
		cav.setCompagnieAerienne(ca);
		cav=Application.getInstance().getCompagnieAerienneVolDao().save(cav);
		
		emf.close();
	}
}
