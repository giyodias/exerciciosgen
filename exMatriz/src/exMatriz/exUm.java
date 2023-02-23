package exMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class exUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		int principal[] = new int[3];
		int secundaria[] = new int[3];
		int somaPrin = 0;
		int somaSec = 0;
		int linha, coluna;
		
		//preenchendo matriz
		//nesse caso usamos 2 for, um pra linha e outro pra coluna. 
		//não utilizei o nome contador pois preciso de uma variavel
		//pras linhas e outra pras colunas para que, no final, eu possa
		//mostrar o numero dentro de determinada linha e coluna.
		for(linha = 0; linha < matriz.length; linha++) {
			for(coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		//calculando diagonal principal
		for(linha = 0; linha < matriz.length; linha++ ) {
			for(coluna = 0; coluna < matriz.length; coluna++) {
				if(coluna == linha) {
					principal[linha] = matriz[linha][coluna];
				}
			}
		}
		//mostrando elementos da diagonal principal
		System.out.println("Elementos da diagonal principal: ");
			for(int elemento : principal) {
				System.out.println(elemento + " ");
				somaPrin = somaPrin + elemento;
			}
			
		//calculando a diagonal secundaria
			for(linha = 0; linha< matriz.length; linha++) {
				for(coluna = 0; coluna < matriz.length; coluna++) {
					if(linha + coluna == matriz.length -1) {
						secundaria[linha] = matriz[linha][coluna];
					}
				}
			}
			//mostrando a diagonal secundária
			System.out.println("Elementos da diagonal secundária");
				for(int elemento : secundaria) {
					System.out.println(elemento + " ");
					somaSec = somaSec + elemento;
				}
				
			System.out.println("Soma dos elementos da diagonal principal: " + somaPrin);
			System.out.println("Soma dos elementos da diagonal secundária: " + somaSec);
				
	}

}
