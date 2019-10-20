package com.example.Rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private LoginRepository loginRepository;
	
	@Autowired 
	private MongoTemplate mongotemplate;
	
	
	public LoginController(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	@RequestMapping(value="/login/{email}", method =RequestMethod.POST)
	public Profile getLoginDetails(@PathVariable String email) {
	
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		return mongotemplate.findOne(query, Profile.class);
		
		
	}
	
}
