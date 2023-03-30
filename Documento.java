public class Documento {
	
	private int numeroDePaginas;
	private int numDocumento;
	private int anoDocumento;
	private String dataDocumento;
	
	public void setNumeroDePaginas (int novoNumeroDePagina) {
		
	numeroDePaginas = novoNumeroDePagina;
	
	}
	public int getNumeroDePaginas() {
		
		return numeroDePaginas;
		
	}
	public void setNumDocumento (int novoNumDocumento) {
		
		numDocumento = novoNumDocumento;
		
		}
	public int getNumDocumento() {
			
		return numDocumento;
			
	}
		
	public void setAnoDocumento (int novoAnoDocumento) {
		
		anoDocumento = novoAnoDocumento;
			
	}
	public int getAnoDocumento() {
				
		return anoDocumento;
				
	}
	public void setDataDocumento (String novoDataDocumento) {
		
		dataDocumento = novoDataDocumento;
			
	}
	public String getDataDocumento() {
				
		return dataDocumento;
				
	}
}


