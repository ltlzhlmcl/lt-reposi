/**
 * 
 */
package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.User;

/**
 * @ClassName:  UserController   
 * @Description:TODO  
 * @author: 
 * @date:   2018年5月30日 上午12:47:31 
 */
@Controller
public class UserController {
	@Autowired
	@Qualifier("serviceImpl")
	private service.Service service;
	/**
	 * 
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/login")
	public ModelAndView login(@RequestParam("loginname") String loginname,@RequestParam("password") String password,HttpSession session,ModelAndView mv){
		User user=service.login(loginname, password);
		if(user!=null){
			session.setAttribute("user_session", user);
			mv.setViewName("redirect:/main");
		}else{
			mv.addObject("message", "登录名或密码错误");
			mv.setViewName("forward:/loginForm");
		}
		return mv;
	}
	
	@RequestMapping(value="/user/removeUser")
	public ModelAndView removeUser(String ids,ModelAndView mv){
		String[] idArray=ids.split(",");
		for(String id:idArray){
			service.removeUserById(Integer.parseInt(id));
		}
		mv.setViewName("redirect:/user/selectUser");
		return mv;
	}
	
}
