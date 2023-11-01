package Controller;

import util.Teclado;

public class Questao03 {
	/*
	 * 3) Fazer um programa que pergunte um valor em Dólares e apresente o
	 * equivalente em Reais. Considere U$1,00 = R$3,80.
	 */

	public static void main(String[] args) {
	   
		double dollar, reais, convert;
		
		dollar = Teclado.lerDouble("Insira o valor da quantia em dollar: ");
		reais = 3.80;
		
		convert = dollar * reais;
		
		System.out.println("Sendo assim "+ dollar + " dollares, é equivalente a : " + convert + " reais");
		
		
	}

}
