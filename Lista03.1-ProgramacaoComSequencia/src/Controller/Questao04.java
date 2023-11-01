package Controller;

import util.Teclado;

public class Questao04 {
	/*
	 * 4) Fazer um programa que pergunte um número inteiro e apresente o seu
	 * antecessor e seu sucessor.
	 */

	public static void main(String[] args) {
		
		int num, ant,suc;
		
		num = Teclado.lerInt("Insira um número:");
		
		ant = num - 1;
		suc = num + 1;
		
		System.out.println("Ö antecessor é " + ant);
		System.out.println("O sucessor é " + suc);

	}

}
