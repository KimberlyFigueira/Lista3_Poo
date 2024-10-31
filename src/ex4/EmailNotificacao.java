package ex4;

public class EmailNotificacao extends Notificacao{
	private String enderecoEmail;
	
	@Override
	public void enviar() {
		super.enviar();
		System.out.println("Mensagem enviada por " + this.enderecoEmail);
	}
	
	@Override
	public void enviar(String assunto) {
		super.enviar(assunto);
		enviar();
	}

	public EmailNotificacao(String mensagem, String destinatario, String enderecoEmail) {
		super(mensagem, destinatario);
		this.enderecoEmail = enderecoEmail;
	}
}
