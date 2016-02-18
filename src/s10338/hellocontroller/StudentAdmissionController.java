package s10338.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
//		model.addObject("headerMsg", "nagłówek1 -> Gontu Collage of Engineering");
		return model;
	}

	@ModelAttribute
	public void addingCommonObject(Model model) {
		model.addAttribute("headerMsg", "nagłówek3 -> Gontu Collage of Engineering");
	}
	
	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student) {
		
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("headerMsg", "nagłówek2 -> Gontu Collage of Engineering");

		

		return model;
	}
}
