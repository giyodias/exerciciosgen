package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
public class TestandoListar {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e Sets";
	
		
	//  arraylist de strings, nome aulas
		ArrayList<String> aulas = new ArrayList<>();
	//  adicionar objetos
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
	//  remover o objeto através do indice
		aulas.remove(0);
	
		System.out.println(aulas);
		
	//  para cada objeto aula(tipo string) dentro de
	//  aulas, faca...
		for(String aula : aulas) {
			System.out.println("Aula " + aula);
		}
		
	//  metodo get, entra em aulas e pede o valor por indice
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
	
	//  metodo size mostra o tamanho da lista, que
	//  nem o length.
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
	// for each - método
	// para cada aula dentro de aulas, faça
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
			});
	
	//classe Collections. o sort arruma em ordem alfabetica
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
	
	
	
	}

}
