package Controller;

import util.Teclado;

public class Questao10 { /*
							 * 10) Fazer um algoritmo que efetue o cálculo do valor de uma prestação em
							 * atraso, utilizando a 
							 * fórmula prestação = valor + (valor x (taxa : 100) x tempo em dias).
							 */

	public static void main(String[] args) {
	
		 double prestacao, valor, taxa,tempoDias;
		 
		 valor = Teclado.lerDouble("Qual valor da prestacao normal (sem atraso): ");
		 taxa = Teclado.lerDouble("Informe a taxa e juros: ");
		 tempoDias = Teclado.lerDouble("Quantos dias de atraso: ");
		 
		 prestacao = valor + (valor * (taxa/100) * tempoDias);
		 
		 System.out.println("O valor da prestacao com juros é de R$ " + prestacao);
		 

		

	}

}
