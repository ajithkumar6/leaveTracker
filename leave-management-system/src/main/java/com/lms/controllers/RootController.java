package com.lms.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lms.SmtpMailSender;

@RestController
public class RootController {
	
	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping(value="/user/apply-leave/mail",method=RequestMethod.GET)
public void sendMail() throws MessagingException {
		
		smtpMailSender.send("ajith.kumar232@gmail.com", "Leave Request", "Janani has requested for leave");
		
	}
	

}