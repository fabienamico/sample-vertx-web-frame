package fr.treeptik.sample.vertxwebframe.service;

import io.vertx.core.Future;

import java.util.List;

import fr.treeptik.sample.vertxwebframe.model.Pet;

public interface PetService {

	void findAll(Future<List<Pet>> future);

	void save(Pet petToSave);

}
