package controladores.archivadores.herramientas;

public class RequestRNdeD {
	private Header header;
	private DataRND data;
	public RequestRNdeD(Header header, DataRND data) {
		super();
		this.header = header;
		this.data = data;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public DataRND getData() {
		return data;
	}
	public void setData(DataRND data) {
		this.data = data;
	}
	
	
}
