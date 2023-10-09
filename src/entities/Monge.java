package entities;

public class Monge extends Personagem{
	
	public Monge() {
		super();
	}

	public Monge(String nome) {
		super(nome);
	}

	@Override
	public String apresentar() {
		return "Minha classe é Monge meu atributo com bônus é Sabedoria -> "+(this.getAtributos().get(4).getValor() + 2);
	}
}
