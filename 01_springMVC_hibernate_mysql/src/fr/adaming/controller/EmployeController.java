package fr.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
