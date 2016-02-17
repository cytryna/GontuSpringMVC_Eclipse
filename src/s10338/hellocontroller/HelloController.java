package s10338.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("/greet")
public class HelloController {

	@RequestMapping(value= "/welcome/countryName/{userName}", method = RequestMethod.GET)
	public ModelAndView helloWorld(@PathVariable("userName") String name) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hello " + name);
		return model;
	}
	
	@RequestMapping("/hi/{userName}")
	public ModelAndView hiWorld(@PathVariable("userName") String name) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "Hi " + name);
		return model;
	}
}


//package s10338.hellocontroller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//public class HelloController extends AbstractController {
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		ModelAndView modelAndView = new ModelAndView("HelloPage");
//		modelAndView.addObject("welcomeMessage", "Hi Radek, welcome to the first Spring Application");
//		return modelAndView;
//	}
//}
