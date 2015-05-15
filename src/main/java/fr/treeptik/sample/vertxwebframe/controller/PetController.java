package fr.treeptik.sample.vertxwebframe.controller;

import io.vertx.core.Future;

import java.util.Date;
import java.util.List;
import java.util.Map;

import fr.treeptik.sample.vertxwebframe.model.Pet;
import fr.treeptik.sample.vertxwebframe.service.PetService;
import fr.treeptik.vertxwebframe.annotation.RequestMapping;
import fr.treeptik.vertxwebframe.controller.SuperController;

public class PetController extends SuperController {

	private PetService petService;
	
	
	@RequestMapping(url="/pet/list.html")
	public void listAll(Map<String, Object> resultParam ){
		
		System.out.println("Controller  Pet Controller");

		Future<List<Pet>> petsFuture = Future.<List<Pet>>future();
		//petService.findAll(petsFuture);
		
		Pet petToSave = new Pet("PetToSave", new Date());
		petService.save(petToSave);

//		List<Pet> pets = new ArrayList<Pet>();
//		while ( ! petsFuture.isComplete()){
//			pets =  petsFuture.result() ;
//		}
//		System.out.println("Pets :: " + pets);
		
		resultParam.put("pet", "Super pet name");
		
	}
	
}
