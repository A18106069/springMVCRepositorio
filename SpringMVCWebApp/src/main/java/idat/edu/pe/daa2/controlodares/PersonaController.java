package idat.edu.pe.daa2.controlodares;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")
public class PersonaController {
      
	@RequestMapping("/inicio")
	
	public String greeting(Model model) {
		model.addAttribute("nombreModulo","REGISTRO DE ALUMNOS");
		return "resultado";
	}
}
