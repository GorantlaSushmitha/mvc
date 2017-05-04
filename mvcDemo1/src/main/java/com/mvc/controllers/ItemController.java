package com.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.Item;
import com.mvc.service.ItemService;

@Controller
public class ItemController 
{
	@Autowired
	private ItemService itemService;
	@RequestMapping("/")
	public String getItemForm(Model model)
	{
		model.addAttribute("itemObj",new Item());
		return "itemform";
	}
	@RequestMapping(value="/itemDetails", method = RequestMethod.POST)
    public String getItemDetails(@ModelAttribute(value="itemObj")  Item item,Model model)
    {
		itemService.saveItem(item);
    	model.addAttribute("item",item);
    	return "itemdetails";	    	
	}
}
