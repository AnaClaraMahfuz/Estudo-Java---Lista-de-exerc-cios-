package Controller;

import util.Teclado;

public class Questao05 { 
	/*
	 * ) Fazer um programa que pergunte o salário de um funcionário e apresente este
	 * salário com um aumento de 15%.
	 */

	public static void main(String[] args) {
		 
		double sal, aum, saltual, salariofinal;
		 
		 sal = Teclado.lerDouble("Insira o valor do seu salário.");
		 
		 aum = 0.15 ;
		 
		 saltual = aum * sal;
		 
		 salariofinal = saltual + sal;
		 
		 System.out.println(" O salário reajustado com base nos 15% é :  " + salariofinal);
		 
		 

	}

}
