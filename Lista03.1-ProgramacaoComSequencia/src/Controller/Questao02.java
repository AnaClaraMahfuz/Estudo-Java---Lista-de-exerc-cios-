package Controller;

import util.Teclado;

public class Questao02 {
	/*
	 * 2) Elaborar um programa que pergunte quatro valores inteiros e apresente 2
	 * resultados: 
	 * a) Resultado de suas adições 
	 * b) Resultado de suas multiplicações
	 */

	public static void main(String[] args) {
		
		int num1,num2,num3,num4;
		int soma;
		int mult;
		
		num1 = Teclado.lerInt("Insira o primeiro número: ");
		num2 = Teclado.lerInt("Insira o segundo número: ");
		num3 = Teclado.lerInt("Insira o terceiro número: ");
		num4 = Teclado.lerInt("Insira o quarto número: ");
		
		
		soma =  num1 + num2 + num3 + num4;
		mult =  num1 * num2 * num3 * num4;
		
		System.out.println("A soma dos quatro números inseridos é :  " + soma );
		System.out.println("A multiplicao dos quatros números inseriso é : " + mult );
		
	}

}
