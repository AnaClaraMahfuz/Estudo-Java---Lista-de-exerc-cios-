package Controller;

import util.Teclado;

public class Questao07 { /*
							 * 7) Fazer um algoritmo que pergunte 3 números e apresente a média aritmética
							 * entre estes 3 números.
							 */

	public static void main(String[] args) {
		
		int num1, num2, num3, mearit;
		
		num1 = Teclado.lerInt("Insira o primeiro núméro: ");
		num2 = Teclado.lerInt("Insira o segundo núméro: ");
		num3 = Teclado.lerInt("Insira o terceiro núméro: ");
		
		mearit = num1 +num2 + num3 / 3 ;
		
		System.out.println("A média aritimética desses três número é: " + mearit);
		
	}

}
