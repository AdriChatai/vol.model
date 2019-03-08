package Vol.test;

import java.util.Date;

import sopra.formation.Application;
import sopra.formation.dao.IPassagerDao;
import sopra.vol.model.Adresse;
import sopra.vol.model.Passager;

public class PassagerTest {

	public static void main(String[] args) {

		IPassagerDao passagerDao = Application.getInstance().getPassagerDao();

		Passager passager = new Passager("Forcade", "Louis", new Date(), "BA123654");
		passager.setAdresse(new Adresse("4 rue claude Kogan", "33700", "Merignac", "France"));

		passager = passagerDao.save(passager);

	}
}
