package controladores.archivadores.herramientas;

import java.util.ArrayList;
import java.util.List;

import controladores.archivadores.empresa.Deudas;

public class InputDeudaRND {
	private List<Deudas> deudasAIngresar;

	public InputDeudaRND(List<Deudas> deudasAIngresar) {
		super();
		this.deudasAIngresar = new ArrayList<>();
	}

	public List<Deudas> getDeudasAIngresar() {
		return deudasAIngresar;
	}
	
	
}
