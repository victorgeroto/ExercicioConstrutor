package ExercicioConstrutor;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("EFD-6009", 123567);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
	}

}
