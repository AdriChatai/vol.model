package Vol.test;

import sopra.formation.Application;
import sopra.formation.dao.IClientDao;
import sopra.formation.dao.IFacturationDao;
import sopra.formation.dao.IPassagerDao;
import sopra.formation.dao.IReservationDao;
import sopra.vol.model.Adresse;
import sopra.vol.model.Civilite;
import sopra.vol.model.ClientEntreprise;
import sopra.vol.model.ClientParticulier;
import sopra.vol.model.StatutJuridique;


public class volTest {

	public static void main(String[] args) {
		IClientDao client = Application.getInstance().getClientDao();
		IPassagerDao passager = Application.getInstance().getPassagerDao();
		IReservationDao reservation = Application.getInstance().getReservationDao();
		IFacturationDao facture = Application.getInstance().getFacturationDao();
		

		IClientDao clientDao = Application.getInstance().getClientDao();         

		ClientParticulier julien = new ClientParticulier("manesdm","julien",Civilite.M);
				
		julien.setAdresse(new Adresse("rue de la paie", "33000", "bordeaux", "france"));
				
		julien = (ClientParticulier) client.save(julien);
				

		ClientEntreprise sopra = new ClientEntreprise("sopra","12151",StatutJuridique.SA,"454");
		clientDao.save(sopra);

	}

}
