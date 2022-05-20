package controladores.archivadores.registros;

import java.util.ArrayList;
import java.util.List;

import controladores.archivadores.herramientas.RequestOdeDB;

public class OficinaDeDeudaDeBerlin {
	private List<RequestOdeDB> requestsEnviadas = new ArrayList<RequestOdeDB>();
	
	public void registrarDeuda(RequestOdeDB request) {
		this.requestsEnviadas.add(request);
		System.out.print("subido");
	}
	
	public RequestOdeDB obtenerPrimerRequest() {
		return this.requestsEnviadas.get(0);
	}

	public List<RequestOdeDB> getRequestsEnviadas() {
		return requestsEnviadas;
	}
	
	public void quitarDeuda(RequestOdeDB request) {
		//crear el codigo para quitar un request de la lista (No les voy a dejar todo servido, haganlo ustedes)
		System.out.print("quitado");
	}
}
