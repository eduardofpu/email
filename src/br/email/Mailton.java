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
			email.setAuthentication("eduardoeanaempreendedores@gmail.com", "cubomagico");// autenticação e senha
			email.setSSLOnConnect(true);
			email.setFrom("eduardoeanaempreendedores@gmail.com");//quem esta enviando o email
			email.setSubject("Assunto testando o email");// assunto
			email.setMsg("Mensagem testando primeiro envio de email em java");//mensagem
			email.addTo("eduardo27_minotauro@hotmail.com");// pra quem vai o email
			email.send();
			
		}catch(EmailException ex){
			Logger.getLogger(EmailJava.class.getName(), null).log(Level.SEVERE,null,ex);
		}
		
	}

}
