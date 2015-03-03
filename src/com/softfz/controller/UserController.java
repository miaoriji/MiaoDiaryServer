package com.softfz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.softfz.constant.Constant;
import com.softfz.model.UserBean;
import com.softfz.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController  {
	
	@Resource
	private UserService userService;

	/**
	 * 首页
	 * @return
	 */
	@RequestMapping(value="index")
	public String userIndex(){
		return "/user/index";
	}
	
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping(value="login")
	public ModelAndView login(UserBean userBean,HttpServletRequest request){
		ModelAndView view = new ModelAndView();
		//String sql = "SELECT count(*) from t_user t where t.name =? and t.password=?";
		Object[] params = new Object[]{userBean.getAccount(),userBean.getPassword()};
		Map map = new HashMap();
		map.put("account", userBean.getAccount());
		map.put("password", userBean.getPassword());
		int count = userService.count("selectUserCountByName", map);
		if(count == 1){//用户存在
			//sql = "SELECT * from t_user t where t.name =? and t.password=?";
			UserBean bean = userService.get("selectUserByName", map);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute(Constant.SESSION_KEY, bean);
			view.addObject("user", userBean);
			view.setViewName("/user/index");
			return view;
		}else{
			
			view.setViewName("redirect:/login");
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message","登录失败");
			return view;
		}
		
	}
}
