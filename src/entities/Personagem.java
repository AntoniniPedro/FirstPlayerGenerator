package entities;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
	protected String nome;
	protected List<Atributos> atributos = new ArrayList<>();
	
	
	public Personagem() {
		
	}
	public Personagem(String nome) {
		this.nome = nome;
		System.out.println("Nome: "+ nome);
		
		this.atributos.add(new Atributos("Força"));
		this.atributos.add(new Atributos("Destreza"));
		this.atributos.add(new Atributos("Constituição"));
		this.atributos.add(new Atributos("Inteligência"));
		this.atributos.add(new Atributos("Sabedoria"));
		this.atributos.add(new Atributos("Carisma"));
		
	}
	public List<Atributos> getAtributos() {
		return atributos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String apresentar() {
		return "Vazio";
	}
	
}
