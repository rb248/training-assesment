package com.example.sprHib;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprHib.model.Resturant;
import com.example.sprHib.service.ResturantService;



@RestController
public class ResturantCtrl {

	@Autowired
	ResturantService resturantService;
	
	@PostMapping(value="resturant")
	public String saveResutrant(@RequestBody Resturant resturant)
	{

		return resturantService.saveResturant(resturant);
	}
	
	@GetMapping(value="resturant")
	public ArrayList<Resturant> getAllRest()
	{
		return resturantService.getResturants(); 
		
	}
	
	@GetMapping(value="resturant/{resturantId}")
	public Object getRest(@PathVariable int resturantId )
	{
		return resturantService.getResturant(resturantId); 
		
	}
	
	
	@DeleteMapping(value="resturant/{resturantId}")
	public String deleteRest(@PathVariable int resturantId )
	{
		return resturantService.deleteResturant(resturantId); 
		
	}
	
	@PutMapping(value="resturant")
	public String updateRest(@RequestBody Resturant resturant )
	{
		return resturantService.updateResturant(resturant); 

	}
	
	
	
}
