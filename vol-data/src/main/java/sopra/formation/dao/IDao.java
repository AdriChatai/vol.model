package sopra.formation.dao;

import java.util.List;

<<<<<<< HEAD
public interface IDao <T, PK> {
=======
public interface IDao<T, PK> {
>>>>>>> master
	List<T> findAll();
	T find(PK id);
	T save(T obj);
	void delete(T obj);
<<<<<<< HEAD
=======

>>>>>>> master
}