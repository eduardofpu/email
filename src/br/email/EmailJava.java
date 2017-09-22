package br.email;

import java.util.logging.Level;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import com.sun.istack.internal.logging.Logger;

public class EmailJava {
		
	Email email;
	
	public EmailJava(){
		email = new SimpleEmail();
		configure();// chama o configure
	}
	
	public void configure(){
		
		
		email.setHostName("smtp.googlemail.com");// smtp padrão do gmail
		email.setSmtpPort(465);// porta do smtp
		email.setDebug(true); // para mostrar o debug no console
		email.setAuthentication("eduardoeanaempreendedores@gmail.com", "cubomagico");// autenticação e senha
		email.setSSLOnConnect(true);// chave ssl tem que estar verdadeira true
	}
	
	public void enviarEmail(String remetente, String assunto, String mensagem, String destino){
		
		try{
			
			email.setFrom(remetente);//quem esta enviando o email
			email.setSubject(assunto);// assunto
			email.setMsg(mensagem);//mensagem
			email.addTo(destino);// pra quem vai o email
			email.addReplyTo(remetente);// para a pessoa responder o email enviando para o cara que mandou o email
			email.send();
			
		}catch(EmailException ex){
			Logger.getLogger(EmailJava.class.getName(), null).log(Level.SEVERE,null,ex);
		}
		
	}

}
