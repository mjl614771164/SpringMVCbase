package com.zhh.controller;

import com.zhh.beans.User;
import com.zhh.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
	private org.slf4j.Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	public void setUserService(UserService userService){
		this.userService = userService;
	}


	@RequestMapping(value="addUser",method = RequestMethod.POST)
	public String addUser(Model model,User user,HttpServletRequest request){
		log.info("user"+user.getPassword());
		userService.add(user);
		return "redirect:userList";
	}
	@RequestMapping(value = "userList")
	public String userList(Model model){
		List<User> users =  userService.list();
		model.addAttribute("users",users);
		log.info("33333333333333344433334444444433");
		log.info("33333333333333344433334444444433");
		return "userList";
	}
	@RequestMapping(value = "delete",method = RequestMethod.GET)
	public String delete(Model model,String id){
		userService.delete(id);
		return "redirect:userList";
	}
	@RequestMapping("/")
	public void  demoMenthod(){
		System.out.println("11111111");
	}
}
