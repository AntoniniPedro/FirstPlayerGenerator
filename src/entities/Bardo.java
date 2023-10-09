package entities;

public class Bardo extends Personagem{
	
	public Bardo() {
		super();
	}

	public Bardo(String nome) {
		super(nome);
	}

	@Override
	public String apresentar() {
		return "Minha classe é Bardo meu atributo com bônus é Carisma -> "+(this.getAtributos().get(5).getValor() + 2);
	}
}
