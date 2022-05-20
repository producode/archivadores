package controladores.archivadores.empresa;

public class Empresa {
	private String nombre;
	private int valoracion;
	private int empleados;
	private int deuda;
	private int efectivo;
	public Empresa(String nombre, int valoracion, int empleados, int deuda, int efectivo) {
		super();
		this.nombre = nombre;
		this.valoracion = valoracion;
		this.empleados = empleados;
		this.deuda = deuda;
		this.efectivo = efectivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public int getEmpleados() {
		return empleados;
	}
	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}
	public int getDeuda() {
		return deuda;
	}
	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}
	public int getEfectivo() {
		return efectivo;
	}
	public void setEfectivo(int efectivo) {
		this.efectivo = efectivo;
	}
	
	
}
