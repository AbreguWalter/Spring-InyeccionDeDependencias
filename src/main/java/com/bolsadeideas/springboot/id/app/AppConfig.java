package com.bolsadeideas.springboot.id.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.id.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.id.app.models.domain.Producto;
import com.bolsadeideas.springboot.id.app.models.service.IService;
import com.bolsadeideas.springboot.id.app.models.service.MiServicio;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	@Primary
	public IService registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IService registrarMiServicioComplejo() {
		return new MiServicio();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Camara Sony",100);
		Producto producto2 = new Producto("Bicicleta",200);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Laptop",150);
		Producto producto2 = new Producto("Impresora",500);
		Producto producto3 = new Producto("Camara",500);
		Producto producto4 = new Producto("Ceular",500);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,1);
		ItemFactura linea3 = new ItemFactura(producto3,1);
		ItemFactura linea4 = new ItemFactura(producto4,1);
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
