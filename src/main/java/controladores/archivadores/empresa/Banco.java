package controladores.archivadores.empresa;

import java.util.ArrayList;
import java.util.List;

public class Banco extends Empresa{
	private List<Empresa> registrosDeEmpresas;
	private int dineroEfectivo;
	private int dineroPrestado;
	
	
	public Banco(String nombre, int valoracion, int empleados, int deuda, int efectivo) {
		super(nombre, valoracion, empleados, deuda, efectivo);
		this.registrosDeEmpresas = new ArrayList<>();
		this.dineroEfectivo = 0;
		this.dineroPrestado = 0;
	}


	public int getDineroEfectivo() {
		return dineroEfectivo;
	}


	public void setDineroEfectivo(int dineroEfectivo) {
		this.dineroEfectivo = dineroEfectivo;
	}


	public int getDineroPrestado() {
		return dineroPrestado;
	}


	public void setDineroPrestado(int dineroPrestado) {
		this.dineroPrestado = dineroPrestado;
	}
	
}
