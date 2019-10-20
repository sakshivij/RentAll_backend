package com.example.Rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class LoginDALImpl implements LoginDAL{

	@Autowired 
	private MongoTemplate mongotemplate;
	
	@Override
	public Profile getLoginDetails(String email) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		return mongotemplate.findOne(query, Profile.class);
	}

}
