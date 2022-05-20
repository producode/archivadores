package controladores.archivadores.herramientas;

public class RequestOdeDB {
	private Header header;
	private DataODB data;
	public RequestOdeDB(Header header, DataODB data) {
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
	public DataODB getData() {
		return data;
	}
	public void setData(DataODB data) {
		this.data = data;
	}
	
	
}
