package es.salesianos.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Titulacion;
import es.salesianos.repository.Repository;

public class Service {


	private Repository repository = new Repository();
	
	public void insert(Titulacion titulacion) {
		repository.insert(titulacion);
	}

}
