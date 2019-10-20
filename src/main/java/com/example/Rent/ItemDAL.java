package com.example.Rent;

import java.util.List;

public interface ItemDAL {
	
	public List<Item> getAllCategories();
	public Item addItem(Item i);
}
