package com.mysprhib.demo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysprhib.model.Resturant;
import com.mysprhib.resturantdao.ResturantDao;

@Controller
public class HomeController {
	
	
	@Autowired
	ResturantDao resturantDao;
	
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	@RequestMapping(value = "/saveRest")
	public String saveRest(Model model,@ModelAttribute Resturant resturant) {
		resturantDao.saveResturant(resturant); 
		model.addAttribute("resturant",resturant);
		return "home2";
	} 
	@RequestMapping(value="/search") 
	public String next(Model model) {
		return "resta";
	} 
	
	@RequestMapping(value="/searchResta")
	public String search(Model model,@RequestParam("name") String name){
		ArrayList<Resturant> rest=resturantDao.searchRestaurant(name); 
		model.addAttribute("restauList",rest);
		return "show";
		
	} 
	@RequestMapping(value="/update")
	public String update(){ 
		return "update";
		
	} 
	@RequestMapping(value="/updateshow")
	public String updateshow(Model model,@RequestParam("rating") String rating ,@RequestParam("name") String name) { 
		resturantDao.updateRating(name, Float.parseFloat(rating)); 
		model.addAttribute("updatemsg","The restaurant is updated");
		return "update"; 
		
		
	}
	
	@RequestMapping(value="/showresta")
	public String show(Model model) {
		ArrayList<Resturant> rl=resturantDao.showRestaurant();
		model.addAttribute("restauList", rl);
		return "showAll";
	} 
	
	@RequestMapping(value="/delete")
	public String delete(Model model) {
		return "delete";
	} 
	@RequestMapping(value="/deleteshow") 
	public String deleteShow(Model model,@RequestParam("name") String name) { 
		resturantDao.deleteRestaurant(name);
		return "home";
	}
} 

