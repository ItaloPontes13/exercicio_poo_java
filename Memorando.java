public class Memorando extends Documento {
	
	private String assunto;
	private String destinatario;
	private String signatario;
	
	public void setAssunto(String novoAssunto) {
		
		assunto = novoAssunto;
	}
	public String getAssunto() {
		
		return assunto;
	}
	public void setDestinatario(String novoDestinatario) {
		
		destinatario = novoDestinatario;
	}
	public String getDestinatario() {
		
		return destinatario;
	}
	public void setSignatario(String novoSignatario) {
		
		signatario = novoSignatario;
	}
	public String getSignatario() {
		
		return signatario;
	}

}

