package fr.adaming.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import fr.adaming.entity.Employe;
import fr.adaming.service.IGenericService;

public class AddEmpController extends AbstractController {

	//Declaration du service
	//@Autowired	//remplace par injection dans employe-servlet.xml
	private IGenericService<Employe> employeService;

	/**
	 * Setter pour injection de dependances Spring.
	 * @param employeService
	 */
	public void setEmployeService(IGenericService<Employe> employeService) {
		this.employeService = employeService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		employeService.add(new Employe("DURAND", "toto", "manager", "departementX", Math.random()*10000));
		
		response.sendRedirect("home.htm");
		return null;
		
//		//Solution pas super opti ici ?? Comment rediriger vers homecontroller?
//		//1. Definition du modele de donnees à retourner vers le DispatcherServlet(pour affichage en vue).
//		//Recup les employes
//		List<Employe> employeList = employeService.getAll();
//
//		//2. Definition du nom logique de la vue à retourner vers la servlet.
//		String viewName = "home";
//
//		//3. Renvoi du modele et de la vue.
//		return new ModelAndView(viewName, "listeDesEmployes", employeList);
	}

}
