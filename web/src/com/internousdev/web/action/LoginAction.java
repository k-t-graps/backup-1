package com.internousdev.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.web.dao.LoginDAO;
import com.internousdev.web.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	
	private String username;
	private String password;
	private List<LoginDTO> LoginDTOList=new ArrayList<LoginDTO();
	private Map<String, Object> session;
	
	public String execute(){
		String ret = ERROR;
		LoginDAO  dao = new LoginDAO();
		
	}

}
