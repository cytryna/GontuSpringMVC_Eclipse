package s10338.hellocontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

//	@InitBinder
	public void initBinder(WebDataBinder binder) {
//		binder.setDisallowedFields(new String[] { "studentMobile" });
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
		// model.addObject("headerMsg", "nagłówek1 -> Gontu Collage of
		// Engineering");
		return model;
	}

	@ModelAttribute
	public void addingCommonObject(Model model) {
		model.addAttribute("headerMsg", "nagłówek3 -> Gontu Collage of Engineering");
	}

	@RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView errorModel = new ModelAndView("AdmissionForm");
			return errorModel;
		}

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		// model.addObject("headerMsg", "nagłówek2 -> Gontu Collage of
		// Engineering");
		return model;
	}
}
