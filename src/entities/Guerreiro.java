package entities;

public class Guerreiro extends Personagem{
	
	public Guerreiro() {
		super();
	}

	public Guerreiro(String nome) {
		super(nome);
	}

	@Override
	public String apresentar() {
		return "Minha classe é Guerreiro meu atributo com bônus é Força -> "+(this.getAtributos().get(0).getValor() + 2);
	}
}
