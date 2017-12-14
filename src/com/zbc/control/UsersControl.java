package com.zbc.control;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zbc.pojo.Users;
import com.zbc.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersControl {
	@Autowired
	private UsersService usersService;
	//用户登录
	@RequestMapping("/login")
	public ModelAndView usersLogin(@Valid Users loginusers,BindingResult result){
		ModelAndView mv =new ModelAndView();
		if(result.hasErrors()==true){
			mv.setViewName("login");
			return mv;
		}
		Users users =usersService.Login(loginusers.getUserName(), loginusers.getPassword());
		if(users!=null){
			mv.setViewName("find");
		}else{
			mv.addObject("error", "用户名或密码不正确");
			mv.setViewName("login");
		}
		return mv;
	}
}
