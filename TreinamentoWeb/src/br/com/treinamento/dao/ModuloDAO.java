package br.com.treinamento.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuloDAO {
	
	private String nome;
	private String instrutorTitular;
	private String instrutorAuxiliar;
	private String dtInicio;
	
	
	
	public ModuloDAO consultarModulos() {
				
	    List<ModuloDAO> modulo = new ArrayList<>();
	    
	    modulo.add("Nivelamento", "Ivo", "Leonardo", "20/06/20");
	    modulo.add("HTML/CSS", "Jonas", "Leonardo", "27/06/20");
	    modulo.add("JAVASCRIPT", "Jonas", "Leonardo", "02/07/20");
	    modulo.add("POO", "Ivo", "Leonardo", "11/06/20");
	    modulo.add("Java", "Leonardo", "Ivo", "18/06/20");
	    modulo.add("BD", "Leonardo", "Fabio", "24/07/20");
	    modulo.add("Aplicações Web", "Fabio", "Ivo", "30/07/20");
	    modulo.add("Spring Boot", "Fabio", "Ivo", "05/08/20");
	    modulo.add("Angular", "Jonas", "Fabio", "13/08/20");
		
	}
}
