package com.project.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
	
//	private AuthenticationService authenticationService;
//	
//	
//	@Autowired
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

//	private Logger logger = LoggerFactory.getLogger(getClass());
//	
//	//LoginController => login.jsp
//	@RequestMapping(value="/",method = RequestMethod.GET)
//	public String gotoWelcomePage(ModelMap model) {
//		model.put("name", "Aditya");
//		return "welcome";
//		
//	}
	
//	// /login, handles POST request
//	@RequestMapping(value="login",method = RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password, ModelMap model) {  //capturing params from FORM
//		
//		if(authenticationService.authenticate(name,password)) {
//		model.put("name", name);
//		return "welcome";
//		}
//		model.put("ErrroMessage", "Please Check ! Entered Invlaid Crediantials");
//		return "login"; //If not valid return back to Login page
//	}

}
