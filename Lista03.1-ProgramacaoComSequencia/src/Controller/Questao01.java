package Controller;

import util.Teclado;

public class Questao01 { 
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu nome completo e seu
	 * sexo. Em seguida, o programa deve apresentar os dados anteriormente
	 * informados.
	 */

	public static void main(String[] args) {
	
	// DECLARACAO DAS VARIAVEIS 
		String nome;
		String sexo;
		
		
	//ENTRADA DE DADOS 	
		nome = Teclado.lerTexto("Ïnsira seu nome completo: ");
		sexo = Teclado.lerTexto("Insira o seu sexo: ");
		
		System.out.println("O nome informado foi: "+ nome );
		System.out.println("O sexo informado foi: " + sexo);
		
		
		
		

	}

}
