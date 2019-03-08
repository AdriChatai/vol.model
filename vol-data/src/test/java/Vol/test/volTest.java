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


public class volTest {

	public static void main(String[] args) {
		IClientDao client = Application.getInstance().getClientDao();
		IPassagerDao passager = Application.getInstance().getPassagerDao();
		IReservationDao reservation = Application.getInstance().getReservationDao();
		IFacturationDao facture = Application.getInstance().getFacturationDao();
		
		
		
		// creation un client : 
 		

				        

				ClientParticulier julien = new ClientParticulier("man", "julien", Civilite.M);
				
				julien.setAdresse(new Adresse("rue de la paie", "33000", "bordeaux", "france"));
				
				julien = (ClientParticulier) client.save(julien);
				

			

	

//				creation deux reservations :

				
				
			
				Date dt =new Date();
				
				Reservation reserv1 = new Reservation("test", false, true, dt);
				
				reserv1.setClient(julien);
				
				reserv1 = reservation.save(reserv1);
				
				
//				
//				
				IReservationDao reservationDao2 = Application.getInstance().getReservationDao();
				
				Reservation reserv2 = new Reservation("num", false, true, dt);
				
				reserv2.setClient(julien);
				
				reserv2 = reservationDao2.save(reserv2);
	
				
	
				

			
//		 		 creation deux factures :
			

					
				Facturation facture1 = new Facturation("123b", ModeDePaiement.VIREMENT, dt);
				
				reserv1.setFacturation(facture1);
				
				facture1 = facture.save(facture1);



//				
//		 		 creation deux passagers :
//		 	
				
				
				

				Passager pass = new Passager("Forcade", "Louis", new Date(), "BA123654");
				
				pass.setAdresse(new Adresse("4 rue claude Kogan", "33700", "Merignac", "France"));

				pass = passager.save(pass);
	





//				IPassager passagerDao1 = ApplicationTpVol.getInstance().getPassagerDao();
//				
//				
//				Date dateDeNaissance = new SimpleDateFormat("dd/MM/yyyy").parse("22/01/1989");
//				
//				Passager passager1 = new Passager("nimp", "bob", dateDeNaissance, "1AF7547851");
//				
//
//				
//				passager1.setAdressePassager(new Adresse("rue", "33600", "Bordeaux", "France"));
//				
//				passagerDao1.create(passager1);
//				reserv1.setPassager(passager1);
//				reservationDao1.update(reserv1);
//				
//				IPassager passagerDao2 = ApplicationTpVol.getInstance().getPassagerDao();
//				
//				Date dateDeNaissance2 = new SimpleDateFormat("dd/MM/yyyy").parse("03/03/2005");
//				
//				Passager passager2 = new Passager("nimp", "bob", dateDeNaissance2, "1896ZE26");
//
//				
//				passager2.setAdressePassager(new Adresse("drole", " ", "FarmerVille", "United States"));
//				
//				passagerDao2.create(passager2);
//				reserv2.setPassager(passager2);
//				reservationDao2.update(reserv2);

	}

}
