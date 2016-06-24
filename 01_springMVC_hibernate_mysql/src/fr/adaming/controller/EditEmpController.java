package fr.adaming.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EditEmpController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//recuperer id
		//recuperer infos en Employe en Bdd
		
		System.out.println("Edit Employe Controller here !");
		response.sendRedirect("formulaireEmploye.htm");

		return null;
	}

}
