package com.bolsadeideas.springboot.id.app.models.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class MiServicio implements IService {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple";
	}

	
	
	
}
