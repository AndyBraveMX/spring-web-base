package com.andy;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
	@RequestMapping("/greeting")
	public ModelAndView greeting() {
		ModelAndView model = new ModelAndView("greeting");
		model.addObject("msg", "Andy");
		return model;
	}

	@RequestMapping(value = "listarFichajesEmpleado", method = RequestMethod.GET)
	public String listarFichajesEmpleado(HttpServletRequest request, Model model) throws Exception {
		// creating the list of corresponding data related to the specific employee
		List<Document> listaFichajes = new ArrayList<Document>();
		// getFichajesEmpleado() will retrieve that data from the DB through the DAO
		// class
		
		Document doc1 = new Document();
		doc1.setEstado("MEX");
		doc1.setNombreEmpleado("Andy");
		
		Document doc2 = new Document();
		doc2.setEstado("PRUEBA");
		doc2.setNombreEmpleado("STACK");
		
		listaFichajes.add(doc1);
		listaFichajes.add(doc2);

		// this is where i think i would add the data to the jsp file
		model.addAttribute("fichajes", listaFichajes);

		return "fichajes"; // returning the fichajes.jsp file again
	}
}
