package controladores.archivadores.herramientas;

public class Header {
	private String canal;
	private String opcion;
	public Header(String canal, String opcion) {
		super();
		this.canal = canal;
		this.opcion = opcion;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	
	
}
