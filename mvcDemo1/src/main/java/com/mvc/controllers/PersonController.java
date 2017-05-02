package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mvc.model.Person;

@Controller
public class PersonController 
{
	@RequestMapping("/personForm")
	public String getPersonForm(Model model)
	{
		model.addAttribute("personObj",new Person());
		return "personform";
	}
	@RequestMapping("/processPersonDetails")
    public String getPersonDetails(@ModelAttribute(value="personObj")  Person person,Model model)
    {
    	model.addAttribute("person",person);
    	return "persondetails";	    	
	}
}
