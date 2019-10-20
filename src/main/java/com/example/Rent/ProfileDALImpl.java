package com.example.Rent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class ProfileDALImpl implements ProfileDAL{

	@Autowired 
	private MongoTemplate mongotemplate;
	
	@Override
	public List<Profile> getAllProfiles() {
		// TODO Auto-generated method stub
		return mongotemplate.findAll(Profile.class);
	}

	@Override
	public Profile getProfileByEmail(String email) {
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		return mongotemplate.findOne(query, Profile.class);
	}

	@Override
	public Profile addProfile(Profile profile) {
	
		mongotemplate.save(profile);
		return profile;
	}

	@Override
	public void deleteProfile(String email) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		mongotemplate.findAllAndRemove(query, Profile.class);
	}

}
