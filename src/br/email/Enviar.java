package br.email;

public class Enviar {
	
	public static void main(String[] args) {
		try {
			
			EmailJava email = new EmailJava();
			email.enviarEmail("javaenviaemailteste@gmail.com","Testando email com java","Java so para os fortes","eduardo27_minotauro@hotmail.com");
			System.out.println("Email enviado com sucesso!");
			
		} catch (Exception e) {
			System.out.println("erro ao enviar o email");
		}
	}

}
	