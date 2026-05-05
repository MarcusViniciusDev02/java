package pratica;

public class Medico extends Funcionario {

	public Medico() {
		super();
	}

	public Medico(String name, int age, Setores setores) {
		super(name, age, setores);
	}

	@Override
	public void seApresentar() {
		System.out.println("eu me chamo:" + getName());

	}

	
}
