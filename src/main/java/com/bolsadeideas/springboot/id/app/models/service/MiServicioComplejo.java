package com.bolsadeideas.springboot.id.app.models.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary //Permite indicar el cantidato por default cuando tienes mas de una impl
public class MiServicioComplejo implements IService {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante Complejo";
	}

	
	
	
}
