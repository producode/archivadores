package controladores.archivadores.empresa;

public class Deudas {
	private Empresa acreedor;
	private Empresa deudor;
	private int cantidad;
	public Deudas(Empresa acreedor, Empresa deudor, int cantidad) {
		super();
		this.acreedor = acreedor;
		this.deudor = deudor;
		this.cantidad = cantidad;
	}
	public Empresa getAcreedor() {
		return acreedor;
	}
	public void setAcreedor(Empresa acreedor) {
		this.acreedor = acreedor;
	}
	public Empresa getDeudor() {
		return deudor;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	
}
