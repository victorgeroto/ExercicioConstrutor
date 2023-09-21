package ExercicioConstrutor;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal(2, "Preto");

		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
	}

}


