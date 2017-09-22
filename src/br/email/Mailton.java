package br.email;

import java.util.logging.Level;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import com.sun.istack.internal.logging.Logger;

public class Mailton {
	
	
	/*jar javamail
	  http://www.oracle.com/technetwork/java/index-138643.html

		commons apache 
		http://commons.apache.org/proper/commons-email/download_email.cgi

		documentação
		http://commons.apache.org/proper/commons-email
	*/
	
	
	public Mailton(){
		
	}
	
	public void enviarEmail(){
		
		try{
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setDebug(true);
			email.setAuthentication("seu email aqui", "a senha do seu email aqui");// autenticação e senha
			email.setSSLOnConnect(true);
			email.setFrom("seu email aqui");//quem esta enviando o email
			email.setSubject("Assunto testando o email");// assunto
			email.setMsg("Mensagem testando primeiro envio de email em java");//mensagem
			email.addTo("email de destino");// pra quem vai o email
			email.send();
			
		}catch(EmailException ex){
			Logger.getLogger(EmailJava.class.getName(), null).log(Level.SEVERE,null,ex);
		}
		
	}

}
