package Controller;

import util.Teclado;

public class Questao08 { 
	
	/*8)Fazer um programa que calcule e apresente a quantidade de litros queum automóvel gastará em
	uma viagem.O programa deve coletar as seguintes informações: Distância a
	percorrer na viagem,em quilômetros; qual é o valor do consumo médio do automóvel,em quilômetros
	por litro.*/

	public static void main(String[] args) {
		double distancia, valorMedio, litros;
		
		distancia = Teclado.lerDouble("Informe a distância a percorrer nesta viagem (em quilometros): ");
		valorMedio = Teclado.lerDouble("Informe o consumo médio do seu carro (em quilometros por litro): ");
		litros = distancia + valorMedio;
		System.out.println("Você precisará de "+ litros + "listros de combustível");
		
		
	}

}
