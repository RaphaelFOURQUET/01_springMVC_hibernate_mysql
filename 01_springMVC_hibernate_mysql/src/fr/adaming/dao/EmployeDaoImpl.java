package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.entity.Employe;

/**
 * Implementation concrete du DAO.
 * @author INTI-0332
 *
 */
@Transactional	//Toutes les methodes publiques de la classe seront transactionnelles.
public class EmployeDaoImpl implements IGenericDAO<Employe> {

	//Declaration Session Factory
	//@Autowired //injection auto de la session factory
	private SessionFactory sessionFactory;

	/**
	 * Setter Factory pour injection Spring
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Ajout d'un employe.
	 */
	@Override
	public void add(Employe pEmploye) {
		//1. Recuperation de la session
		Session session = sessionFactory.openSession();	//On va le faire à chaque methode, on peut factoriser

		//2. Ajout de l'employe avec la methode save() de la session
		session.save(pEmploye);

	}

	/**
	 * Mise à jour d'un employe.
	 */
	@Override
	public void update(Employe pEmploye) {
		//Recuperer la session
		Session session = sessionFactory.openSession();

		//Plusieurs facons de faire
		session.update(pEmploye);	//par session


		//Par requete HQL.
//		String hqlUpdateEmployeReq = "Update employe e Set e.fonction = :pFonction "
//				+ "Where e.id = :pId";
//
//		//Definition de la requete hibernate
//		Query request = session.createQuery(hqlUpdateEmployeReq);
//
//		//Passage des parametres à la requete
//		request.setParameter("pFonction", pEmploye.getFonction());
//		request.setParameter("pId", pEmploye.getId());
//
//		//Executer la requete
//		//result : Nombres de lignes modifiees dans la bdd
//		int result = request.executeUpdate();
//		System.out.println("Nombre d'employes MAJ =========> : "+result);
//		if(result > 1) {
//			System.out.println("Coherence des donnees compromises : 2 employes de même Id.");
//		}
	}

	/**
	 * Supprimer un employe.
	 */
	@Override
	public void delete(Employe pEmploye) {
		//Recuperer la session
		Session session = sessionFactory.openSession();

		//par session
		session.delete(pEmploye);

		//HQL
		String hqlDeleteReq = "Delete From employe e "
				+ "Where e.id = :pId";
		//requete hibernate
		Query request = session.createQuery(hqlDeleteReq);

		//Passage des parametres à la requete
		request.setParameter("pId", pEmploye.getId());

		//Executer la requete
		int verif = request.executeUpdate();

		System.out.println("Nombre d'employes Supprimes =========> : "+verif);
	}

	/**
	 * Recuperer un employe par son Id.
	 */
	@Override
	public Employe getById(Object id) {
		Session session = sessionFactory.openSession();

		//1ere methode : session
		//		Employe empl = (Employe) session.get(Employe.class, (Serializable) id);
		//		
		//		return empl;
		
		//2eme methode : par HQL
		String hqlGetEmployeReq = "From employe e Where e.id = :pId";

		Query request = session.createQuery(hqlGetEmployeReq);

		request.setParameter("pId", id);
		
		return (Employe) request.uniqueResult();

	}

	@Override
	public List<Employe> getAll() {
		Session session = sessionFactory.openSession();

		//par HQL
		String hqlGetEmployesReq = "From employe e";

		Query request = session.createQuery(hqlGetEmployesReq);

		return request.list();
	}

}
