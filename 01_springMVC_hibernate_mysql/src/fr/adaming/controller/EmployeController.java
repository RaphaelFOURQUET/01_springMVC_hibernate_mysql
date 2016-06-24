package fr.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.entity.Employe;
import fr.adaming.service.IGenericService;

/**
 * 
 * @author INTI-0332
 *
 */
//@Component	//Declaration du bean par annotation (@Controller @Service et @Repository sont des sous classes de component)
@Controller		//Declaration du bean par annotation
@RequestMapping(value="/employe")	//Mapping url /employe sur ce controller
public class EmployeController {

	@Autowired	//Injection de dependances par annotation
	private IGenericService<Employe> employeService;
	
	/**
	 * Initialise un nouvel employe vers la vue.
	 * @return
	 */
	@RequestMapping(value="/addEmploye", method=RequestMethod.GET)
	private ModelAndView addEmploye() {
		
		//Definition du nom logique de la vue.
		String viewName = "formulaireEmploye";
		
		//renvoi du nom logique de la vue et du modele (nouvel Employe)
		return new ModelAndView(viewName, "currentEmploye", new Employe());
	}

	/**
	 * Methode de suppression d'un employe.
	 * @return
	 */
	@RequestMapping(value="/deleteEmploye/{employeID}")
	public String supprimerEmploye(@PathVariable("employeID") int pIdEmploye, 
			ModelMap model) {

		//Appel du service pour supprimer l'employe
		this.employeService.delete(this.employeService.getById(pIdEmploye));

		//Recuperer les employes de la Bdd
		model.addAttribute("listeDesEmployes", this.employeService.getAll());

		return "home";
	}

	/**
	 * Methode d'ajout d'un employe deprecated.
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/ajouterEmploye")
	public String ajouterEmploye(ModelMap model) {

		employeService.add(new Employe("DURAND", "toto", "manager", "departementX", Math.random()*10000));

		//Recuperer les employes de la Bdd
		model.addAttribute("listeDesEmployes", this.employeService.getAll());

		return "home";

	}

}
