package ex4;

public class Main {

	public static void main(String[] args) {
		Notificacao emailNotificacao = new EmailNotificacao("Olá, você tem um novo e-mail!", "João", "joao@email.com");
        Notificacao smsNotificacao = new SmsNotificacao("Olá, você tem um novo SMS!", "Maria", "555-1234");
        
        Notificacao[] notificacoes = { emailNotificacao, smsNotificacao };
        
        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar();
        }
        
        System.out.println();
        
        for (Notificacao notificacao : notificacoes) {
        	notificacao.enviar("Notificação importante");
        }
	}

}
