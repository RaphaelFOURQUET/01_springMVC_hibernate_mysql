package fr.adaming.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import fr.adaming.entity.Employe;
import fr.adaming.service.IGenericService;

public class DeleteEmpController extends AbstractController {

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
		//Recuperer l'id employe.
		int id = Integer.parseInt(request.getParameter("id"));
		//Recuperer l'employe correspondant
		Employe emp = employeService.getById(id);
		//Delete employe
		employeService.delete(emp);
		//Rediriger
		response.sendRedirect("home.htm");
		return null;
	}

}
