package com.nikola.webtask;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	public static String ip;
	public static String userAgent;
	public static Date date;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "/connection")
	public ModelAndView getUserInfo() {

		ModelAndView modelandView = new ModelAndView("pages/UserInfo");

		ip = request.getRemoteAddr();
		modelandView.addObject("msg1", "Your IP is " + ip);

		userAgent = request.getHeader("User-Agent");
		modelandView.addObject("msg2", "Your User agent is " + userAgent);

		date = new java.util.Date();
		modelandView.addObject("msg3", "Your last log was at " + date);

		Main.saveUserToDB(new UserInformation(ip, userAgent, date));

		return modelandView;

	}

	@RequestMapping(value = "/connection-lists")
	public ModelAndView getTest() {

		ModelAndView modelandView = new ModelAndView("pages/listUserInfo");

		modelandView.addObject("users", Main.getUsersFromDB());

		return modelandView;

	}

}
