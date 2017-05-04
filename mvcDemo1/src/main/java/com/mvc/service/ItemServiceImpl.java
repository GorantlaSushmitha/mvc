package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.ItemDao;
import com.mvc.model.Item;

@Service
public class ItemServiceImpl implements ItemService 
{
	@Autowired
	private ItemDao itemDao;
	public void saveItem(Item item)
	{
		itemDao.saveItem(item);
	}
	public void savePerson(Item item) {
		// TODO Auto-generated method stub
		
	}
	
}
