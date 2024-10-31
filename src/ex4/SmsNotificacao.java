package ex4;

public class SmsNotificacao extends Notificacao{
	
	private String numeroTelefone;
	
	@Override
	public void enviar() {
		System.out.println("Mensagem enviada à  " + this.getDestinatario() + " por " + numeroTelefone);
	}

	public SmsNotificacao(String mensagem, String destinatario, String numeroTelefone) {
		super(mensagem, destinatario);
		this.numeroTelefone = numeroTelefone;
	}

}
