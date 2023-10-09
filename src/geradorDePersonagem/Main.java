package geradorDePersonagem;

import java.util.Scanner;

import entities.Barbaro;
import entities.Bardo;
import entities.Guerreiro;
import entities.Ladino;
import entities.Mago;
import entities.Monge;
import entities.Personagem;

public class Main {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o nome de um novo personagem: ");
		String nome = leitor.nextLine();
		Personagem p = null;
		
		int aleatorio = (int) ((Math.random() * (6-1))+1);
		switch (aleatorio) {
		case 1:
			p = new Guerreiro(nome);
			break;
		case 2:
			p = new Ladino(nome);
			break;
		case 3:
			p = new Barbaro(nome);
			break;
		case 4:
			p = new Mago(nome);
			break;
		case 5:
			p = new Monge(nome);
			break;
		case 6:
			p = new Bardo(nome);
			break;	
		}
		
		System.out.println(p.apresentar()); 
		System.out.println();
		
		p = new Guerreiro("Kennedy");
		System.out.println(p.apresentar());
		System.out.println();
		p = new Ladino("Pedro");
		System.out.println(p.apresentar());
		System.out.println();
		p = new Barbaro("João");
		System.out.println(p.apresentar());
		System.out.println();
		p = new Mago("Hiago");
		System.out.println(p.apresentar());
		System.out.println();
		p = new Monge("Samara");
		System.out.println(p.apresentar());
		System.out.println();
		p = new Bardo("Diego");
		System.out.println(p.apresentar());
		System.out.println();
		
		
		
		leitor.close();
	}
}
