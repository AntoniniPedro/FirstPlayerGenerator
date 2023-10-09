package entities;

public class Atributos {
		private String nome;
		private int valor = 0;
		private int[] dados = new int[4];
		private int menor = 7;
		
		public Atributos() {
			
		}
		public Atributos(String nome) {
			this.nome = nome;
			addAtributos();
			System.out.println(nome+ ": "+dados[0]+", "+dados[1]+", "+dados[2]+", "+dados[3]+" -> "+valor);
		}
		public int getValor() {
			return valor;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int[] getDados() {
			return dados;
		}
		public void addAtributos() {
			for(int i=0; i<4; i++) {
				dados[i] = (int) ((Math.random() * (5)) + 1);
				if(dados[i] < menor) {
					menor = dados[i];
				}
				valor += dados[i];
			}
			valor -= menor;
		}
		
		
}
