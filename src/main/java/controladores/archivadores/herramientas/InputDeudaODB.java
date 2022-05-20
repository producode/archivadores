package controladores.archivadores.herramientas;

import controladores.archivadores.empresa.Empresa;

public class InputDeudaODB {
	private int cantidad;
	private Empresa deudor;
	public InputDeudaODB(int cantidad, Empresa deudor) {
		super();
		this.cantidad = cantidad;
		this.deudor = deudor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Empresa getDeudor() {
		return deudor;
	}
	public void setDeudor(Empresa deudor) {
		this.deudor = deudor;
	}
	
	
}
