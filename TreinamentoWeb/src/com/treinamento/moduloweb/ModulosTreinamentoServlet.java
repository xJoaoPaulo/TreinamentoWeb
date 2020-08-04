package com.treinamento.moduloweb;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/modulos")

public class ModulosTreinamentoServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void ModulosDao() {
		System.out.println("Iniciando a nosssa servlet...");
		
		ModuloDao modulo = new ModuloDao();
		List<modulo> listaModulos = modulo.listarModulos();
		
		req.setAttribute("modulos", listaModulos);
		
		RequestDispatcher rd = req.getRequestDispatcher("/consultar_modulos.jsp");
		rd.forward(req, resp);
		
		
		
		
	}

}
