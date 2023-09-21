package ExercicioConstrutor;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta("29/02/2024", "MestreEsplinter", "Ziraldo");

		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
	}

}


