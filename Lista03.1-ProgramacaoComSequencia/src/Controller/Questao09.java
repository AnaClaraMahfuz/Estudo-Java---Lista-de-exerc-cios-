package Controller;

import util.Teclado;

public class Questao09 {
	
	/*9) Fazer um algoritmo que pergunte 1 número e apresente:
		a) O próprio número
		b) O quadrado deste número
		c) A raiz quadrada deste número*/

	public static void main(String[] args) {
		
		double num, raiz2, quadrado ;
		num = Teclado.lerDouble("Por favor informe um número: ");
		raiz2 = num * num ;
		quadrado = Math.pow(num, 2);
		
		System.out.println("A - O número inserido foi:"+ num);
		System.out.println("B - O quadrado de "+ num +" é " + raiz2);
		System.out.println("c - A raiz quadrada do "+ num + " é " + quadrado );
		
		

	}

}
