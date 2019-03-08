package Vol.test;

import java.util.Date;

import sopra.formation.Application;
import sopra.formation.dao.IClientDao;

import sopra.formation.dao.IFacturationDao;
import sopra.formation.dao.IPassagerDao;
import sopra.formation.dao.IReservationDao;

import sopra.vol.model.Adresse;
import sopra.vol.model.Civilite;
import sopra.vol.model.ClientParticulier;
import sopra.vol.model.Facturation;
import sopra.vol.model.ModeDePaiement;
import sopra.vol.model.Passager;
import sopra.vol.model.Reservation;

public class TestJulien {

	public static void main(String[] args) {

		IClientDao client = Application.getInstance().getClientDao();
		IPassagerDao passager = Application.getInstance().getPassagerDao();
		IReservationDao reservation = Application.getInstance().getReservationDao();
		IFacturationDao facture = Application.getInstance().getFacturationDao();

		ClientParticulier julien = new ClientParticulier("man", "julien", Civilite.M);

		julien.setAdresse(new Adresse("rue de la paie", "33000", "bordeaux", "france"));

		julien = (ClientParticulier) client.save(julien);
		Date dt = new Date();

		Reservation reserv1 = new Reservation("test", false, true, dt);

		reserv1.setClient(julien);

		reserv1 = reservation.save(reserv1);

		IReservationDao reservationDao2 = Application.getInstance().getReservationDao();

		Reservation reserv2 = new Reservation("num", false, true, dt);

		reserv2.setClient(julien);

		reserv2 = reservationDao2.save(reserv2);

		Facturation facture1 = new Facturation("123b", ModeDePaiement.VIREMENT, dt);

		reserv1.setFacturation(facture1);

		facture1 = facture.save(facture1);

		Passager pass = new Passager("Forcade", "Louis", new Date(), "BA123654");

		pass.setAdresse(new Adresse("4 rue claude Kogan", "33700", "Merignac", "France"));

		pass = passager.save(pass);

	}
}
