package br.gov.dataprev;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController extends AbstractController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return new ModelAndView("bemvindo","welcomeMessage", "test message!");
	}
	
	@RequestMapping("/bemvindo")
	public ModelAndView bemVindo(Model model){
		model.addAttribute("bemvindoParam" , "Olha só que facil dizer bem vindo");
		return new ModelAndView("bemvindo");
	}
	
	@RequestMapping("/helloworld")
	public ModelAndView helloWorld(Model model) {
		return new ModelAndView("helloworld");
	}
	
} 