package Vol.test;

public class volTest {

	public static void main(String[] args) {
		// creation un client : 
 		
				IClient clientDao = ApplicationTpVol.getInstance().getClientDao();         

				ClientParticulier julien = new ClientParticulier("julien"," M.", "198585", "manem");
				
				julien.setAdresse(new Adresse("rue de la paie", "33000", "bordeaux", "france"));
				
				clientDao.create(julien);
				

				// creation deux reservations :
				
				IReservation reservationDao1 = ApplicationTpVol.getInstance().getReservationDao();
			
				Reservation reserv1 = new Reservation(false, true, new Date());
				
				reserv1.setClient(julien);
				
				reservationDao1.create(reserv1);
				
				
				IReservation reservationDao2 = ApplicationTpVol.getInstance().getReservationDao();
				
				Reservation reserv2 = new Reservation(false, true, new Date());
				
				reserv2.setClient(julien);
				
				reservationDao2.create(reserv2);
				
				
		 	// creation deux factures :
				
				IFacturation factureDao1 = ApplicationTpVol.getInstance().getFacturationDao();
				
				Facturation facture1 = new Facturation("virement", new Date());
				
				reserv1.setFacturation(facture1);
				
				factureDao1.create(facture1);
				
				
				IFacturation factureDao2 = ApplicationTpVol.getInstance().getFacturationDao();
				
				Facturation facture2 = new Facturation("virement", new Date());
			
				factureDao2.create(facture2);
				reserv2.setFacturation(facture2);
				reservationDao2.update(reserv2);
				
		 		// creation deux passagers :
		 	
				IPassager passagerDao1 = ApplicationTpVol.getInstance().getPassagerDao();
				
				
				Date dateDeNaissance = new SimpleDateFormat("dd/MM/yyyy").parse("22/01/1989");
				
				Passager passager1 = new Passager("nimp", "bob", dateDeNaissance, "1AF7547851");
				

				
				passager1.setAdressePassager(new Adresse("rue", "33600", "Bordeaux", "France"));
				
				passagerDao1.create(passager1);
				reserv1.setPassager(passager1);
				reservationDao1.update(reserv1);
				
				IPassager passagerDao2 = ApplicationTpVol.getInstance().getPassagerDao();
				
				Date dateDeNaissance2 = new SimpleDateFormat("dd/MM/yyyy").parse("03/03/2005");
				
				Passager passager2 = new Passager("nimp", "bob", dateDeNaissance2, "1896ZE26");

				
				passager2.setAdressePassager(new Adresse("drole", " ", "FarmerVille", "United States"));
				
				passagerDao2.create(passager2);
				reserv2.setPassager(passager2);
				reservationDao2.update(reserv2);

	}

}
