package fr.adaming.entity;

import java.io.Serializable;

/**
 * Objet persistant.
 * @author INTI-0332
 *
 */
public class Employe implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//Declaration des proprietes
	private int id;
	private String nom;
	private String prenom;
	private String fonction;
	private String departement;
	private double salaire;

	//Declaration des accesseurs : obligatoire pour JavaBean
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	//Declaration des constructeurs : obligatoire pour JavaBean
	/**
	 * Default constructor
	 */
	public Employe() {
		super();
	}

	/**
	 * Constructor without ID.
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param departement
	 * @param salaire
	 */
	public Employe(String nom, String prenom, String fonction, String departement, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.departement = departement;
		this.salaire = salaire;
	}

	/**
	 * Constructor with ID.
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param departement
	 * @param salaire
	 */
	public Employe(int id, String nom, String prenom, String fonction, String departement, double salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.departement = departement;
		this.salaire = salaire;
	}
	
	
	
	
	
	
}
