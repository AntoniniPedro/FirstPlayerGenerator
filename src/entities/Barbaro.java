package entities;

public class Barbaro extends Personagem{
	
	public Barbaro() {
		super();
	}

	public Barbaro(String nome) {
		super(nome);
	}

	@Override
	public String apresentar() {
		return "Minha classe é Bárbaro meu atributo com bônus é Constituição -> "+(this.getAtributos().get(2).getValor() + 2);
	}	
}
