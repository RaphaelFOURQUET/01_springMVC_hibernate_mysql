package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.dao.EmployeDaoImpl;
import fr.adaming.entity.Employe;

/**
 * Implementation concrete du service.
 * @author INTI-0332
 *
 */
public class EmployeServiceImpl implements IGenericService<Employe> {
	
	//Declaration DAO
	@Autowired
	private EmployeDaoImpl employeDao;
	
	/**
	 * Setter pour Injection de dependances Spring.
	 * @param employeDao
	 */
	public void setEmployeDao(EmployeDaoImpl employeDao) {
		this.employeDao = employeDao;
	}

	@Override
	public void add(Employe pEmploye) {
		employeDao.add(pEmploye);
		
	}

	@Override
	public void update(Employe pEmploye) {
		employeDao.update(pEmploye);
		
	}

	@Override
	public void delete(Employe pEmploye) {
		employeDao.delete(pEmploye);
		
	}

	@Override
	public Employe getById(Object idEmploye) {
		return employeDao.getById(idEmploye);
	}

	@Override
	public List<Employe> getAll() {
		return employeDao.getAll();
	}
	
	

}
