package com.zheng.demo.controller;

import com.zheng.common.base.BaseController;
import com.zheng.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试controller
 * Created by shuzheng on 2017/3/21.
 */
@Controller
public class IndexController extends BaseController {

	private static Logger _log = LoggerFactory.getLogger(IndexController.class);

	/**
	 * jsp视图
	 * @return
	 */
	@RequestMapping(value = "/jsp", method = RequestMethod.GET)
	public String jsp() {
		return "/index.jsp";
	}

	/**
	 * thymeleaf视图
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/thymeleaf", method = RequestMethod.GET)
	public String thymeleaf(Model model) {
		model.addAttribute("host", "http://www.zhangshuzheng.cn");
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId(1l);
		user.setAge(11);
		user.setName("zhangsan");
		users.add(user);
		user = new User();
		user.setId(2l);
		user.setAge(22);
		user.setName("lisi");
		users.add(user);
		model.addAttribute("users", users);
		return "/index";
	}

}