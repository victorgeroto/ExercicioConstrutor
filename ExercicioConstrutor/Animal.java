package ExercicioConstrutor;

public class Animal {

	private float tamanho;
	private String cor;

	public Animal(float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public Float getTamanho() {
		return tamanho;
	}

	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}