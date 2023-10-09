package entities;

public class Ladino extends Personagem{
	
	public Ladino() {
		super();
	}

	public Ladino(String nome) {
		super(nome);
	}

	@Override
	public String apresentar() {
		return "Minha classe é Ladino meu atributo com bônus é Destreza -> "+(this.getAtributos().get(1).getValor() + 2);
	}
}
