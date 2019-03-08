package sopra.formation.dao;

import java.util.List;


import sopra.vol.model.Client;
import sopra.vol.model.ClientEntreprise;
import sopra.vol.model.ClientParticulier;

public interface IClientDao extends IDao<Client, Long>{
	List<ClientEntreprise> findAllClientEntreprise();
	List<ClientParticulier> findAllClientParticulier();
}
