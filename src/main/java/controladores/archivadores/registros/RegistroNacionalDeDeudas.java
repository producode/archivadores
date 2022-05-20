package controladores.archivadores.registros;

import java.util.ArrayList;
import java.util.List;

import controladores.archivadores.herramientas.RequestRNdeD;

public class RegistroNacionalDeDeudas {
	private List<RequestRNdeD> requestsEnviadas = new ArrayList<RequestRNdeD>();
	
	public void registrarDeuda(RequestRNdeD request) {
		this.requestsEnviadas.add(request);
		System.out.print("subido");
	}
	
	public RequestRNdeD obtenerPrimerRequest() {
		return this.requestsEnviadas.get(0);
	}

	public List<RequestRNdeD> getRequestsEnviadas() {
		return requestsEnviadas;
	}
	
	public void quitarDeuda(RequestRNdeD request) {
		//crear el codigo para quitar un request de la lista (No les voy a dejar todo servido, haganlo ustedes)
		System.out.print("quitado");
	}
}
