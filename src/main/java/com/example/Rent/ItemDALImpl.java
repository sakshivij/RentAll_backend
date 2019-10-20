package com.example.Rent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ItemDALImpl implements ItemDAL{

	@Autowired 
	private MongoTemplate mongotemplate;
	
	@Override
	public List<Item> getAllCategories() {
		// TODO Auto-generated method stub
		return mongotemplate.findAll(Item.class);
	}

	@Override
	public Item addItem(Item i) {
		// TODO Auto-generated method stub
		return mongotemplate.save(i);
	}
	

}
