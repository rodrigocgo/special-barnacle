package distance;

import java.util.Scanner;

public class AppDistance {



	public static void main(String[] args) {
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.println("Digite a distancia em KM entre os dois objetos");
			int iDistancia = leitura.nextInt();
			System.out.println("O tempo em minutos é: " + ConversorUnidades.QuantidadeMinutosParaChegarDestino(60,90,iDistancia));
		}
	}
	
}	
