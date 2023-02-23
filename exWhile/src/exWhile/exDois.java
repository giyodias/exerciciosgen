package exWhile;

import java.util.Scanner;

public class exDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char res;
		int idade, genero, categoria;
		int backend = 0, frontend = 0, fullstack = 0, mobile = 0;
		 
		
		System.out.println("Deseja cadastrar um novo colaborador? (s/n)");
		res = leia.next().charAt(0);
		
		while(res == 's') {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o gênero: ");
			genero = leia.nextInt();
			
			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				backend++;
			}else if(genero == 2 && categoria == 2) {
				frontend++;
			}else if(genero == 1 && categoria == 3 && idade > 40) {
				mobile++;
			}else if(genero == 2 && categoria == 4 && idade <30) {
				fullstack++;
			}
			System.out.println("Deseja cadastrar um novo colaborador? (s/n)");
			res = leia.next().charAt(0);
		}
			
		System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("Número de homens desenvolvedores mobile maiores de 40 anos: " + mobile);
		System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);
		
		leia.close();
	}
}
