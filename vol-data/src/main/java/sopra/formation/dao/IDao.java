package sopra.formation.dao;

import java.util.List;

<<<<<<< Updated upstream
public interface IDao <T, PK> {

=======

public interface IDao <T, PK> {
>>>>>>> Stashed changes
	List<T> findAll();
	T find(PK id);
	T save(T obj);
	void delete(T obj);
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
}