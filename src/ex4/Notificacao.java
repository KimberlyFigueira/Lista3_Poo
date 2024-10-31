package ex4;

public class Notificacao {
	private String mensagem;
	private String destinatario;
	
	public void enviar() {
		System.out.println("Mensagem enviada à  " + this.destinatario + ": " + mensagem);
		System.out.println();
	}
	
	public void enviar(String assunto) {
		System.out.println(assunto);
		enviar();
	}
	
	public Notificacao() {
		super();
	}

	public Notificacao(String mensagem, String destinatario) {
		super();
		this.mensagem = mensagem;
		this.destinatario = destinatario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
}
