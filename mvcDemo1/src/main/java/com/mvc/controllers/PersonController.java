package com.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.Person;
import com.mvc.service.PersonService;

@Controller
public class PersonController 
{
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/personForm")
	public String getPersonForm(Model model)
	{
		model.addAttribute("personObj",new Person());
		return "personform";
	}
	@RequestMapping(value="/processPersonDetails", method = RequestMethod.POST)
    public String getPersonDetails(@ModelAttribute(value="personObj")  Person person,Model model)
    {
		personService.savePerson(person);
    	model.addAttribute("person",person);
    	return "persondetails";	    	
	}
}
