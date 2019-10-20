package com.example.Rent;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	private ItemRepository itemrepository;
	
	public ItemController(ItemRepository itemRepository) {
		this.itemrepository = itemRepository;
	}
	
	@RequestMapping("/categories")
	public List<Item> getAllCategories(){
		
		return itemrepository.findAll();
	}
	
	
	@RequestMapping(value ="/categories/add", method= RequestMethod.POST)
	public Item addProfile(@RequestBody Item i) {
		return itemrepository.save(i);
	}
	
}
