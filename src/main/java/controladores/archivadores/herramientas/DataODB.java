package controladores.archivadores.herramientas;

import controladores.archivadores.empresa.Empresa;

public class DataODB {
	private Empresa Acreedor;
	private InputDeudaODB inputDeuda;
	public DataODB(Empresa acreedor, InputDeudaODB inputDeuda) {
		super();
		Acreedor = acreedor;
		this.inputDeuda = inputDeuda;
	}
	public Empresa getAcreedor() {
		return Acreedor;
	}
	public void setAcreedor(Empresa acreedor) {
		Acreedor = acreedor;
	}
	public InputDeudaODB getInputDeuda() {
		return inputDeuda;
	}
	public void setInputDeuda(InputDeudaODB inputDeuda) {
		this.inputDeuda = inputDeuda;
	}
	
	
}
