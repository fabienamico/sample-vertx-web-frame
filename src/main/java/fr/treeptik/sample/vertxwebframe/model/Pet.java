package fr.treeptik.sample.vertxwebframe.model;

import java.io.Serializable;
import java.util.Date;

public class Pet implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Date birthDate;
	
	public Pet() {
	}

	public Pet(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}

