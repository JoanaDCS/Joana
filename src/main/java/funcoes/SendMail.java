package funcoes;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

@ManagedBean
public class SendMail {
	private Mensagem mensagem = new Mensagem();
	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	private static final String TITULO = "Recuperar senha de acesso ao sistema Joana";
	private static final String MENSAGEM = "Sua Senha foi enviada para o email";
	private static final String HOSTNAME = "smtp.gmail.com";
	private static final String USERNAME = "joana";
	private static final String PASSWORD = "123456";
	private static final String EMAILORIGEM = "joana.darc.ufpi@gmail.com";

	public static void enviaEmail(Mensagem mensagem) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName(HOSTNAME);
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
		email.setTLS(true);
		email.setFrom(EMAILORIGEM);
		email.setSubject(TITULO);
		email.setMsg(MENSAGEM);
		email.addTo(mensagem.getEmail());
		String resposta = email.send();
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"E-mail enviado com sucesso para: "
								+ mensagem.getEmail(), "Informação"));
	}

}
