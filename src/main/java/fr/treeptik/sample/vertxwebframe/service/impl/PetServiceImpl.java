package fr.treeptik.sample.vertxwebframe.service.impl;

import io.vertx.core.Future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import fr.treeptik.sample.vertxwebframe.model.Pet;
import fr.treeptik.sample.vertxwebframe.service.PetService;

public class PetServiceImpl implements PetService {

	// HACK : This must be in the database
	private List<Pet> dataBasePet = new ArrayList<Pet>(Arrays.asList(new Pet("Bambi", new Date()), new Pet("Elvis", new Date())));

	@Override
	public void save(Pet petToSave) {

		System.out.println("PetServiceImpl " + petToSave);
		dataBasePet.add(petToSave);
		
	}

	@Override
	public void findAll(Future<List<Pet>> future) {

		System.out.println("Find ALL " + future);
		future.complete(dataBasePet);
		
	}

}
