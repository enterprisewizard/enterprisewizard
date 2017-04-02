package ew.controller;

//import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ew.framework.controller.BaseController;

@Controller("ew.indexController")
@RequestMapping("/ew")
public class IndexController extends BaseController{

	
	@RequestMapping("")
	public String index() {
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}

	
}