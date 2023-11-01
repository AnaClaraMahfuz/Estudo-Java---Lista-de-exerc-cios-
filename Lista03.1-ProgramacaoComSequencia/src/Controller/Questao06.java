package Controller;

import util.Teclado;

public class Questao06 { /*
							 * 6) Fazer um programa que pergunte uma temperatura ao usuário, em graus
							 * Fahrenheit, e apresente esta temperatura convertida em graus Celsius. A
							 * fórmula da conversão é c = (f – 32) x 5 : 9 , onde c é a temperatura em graus
							 * Celsius e f em Fahrenheit.
							 */

	public static void main(String[] args) {
		
		double tempfahr,tempcel;
		
		tempfahr = Teclado.lerDouble("Insira a tempetratura em fahrenheit: ");
		
		tempcel = tempfahr - 32 * 5 / 9;
		
		System.out.println("A temperatura convertida em grau celsius é : " + tempcel);
		
		System.out.println("A temperatura convertida em grau fahrenheit é : " + tempfahr);
		
	}

}
