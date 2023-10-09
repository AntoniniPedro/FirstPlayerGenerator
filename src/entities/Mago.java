package entities;

public class Mago extends Personagem{
	
	public Mago() {
		super();
	}

	public Mago(String nome) {
		super(nome);
	}

	@Override
	public String apresentar() {
		return "Minha classe é Mago meu atributo com bônus é Inteligência -> "+(this.getAtributos().get(3).getValor() + 2);
	}
}
