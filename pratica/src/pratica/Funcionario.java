package pratica;

public abstract class Funcionario {
	private String name;
	private int age;
	private Setores setores;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String name, int age, Setores setores) {
		this.name = name;
		this.age = age;
		this.setores = setores;
	}

	public abstract void seApresentar();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public Setores getSetores() {
		return setores;
	}


	public void setSetores(Setores setores) {
		this.setores = setores;
	}
	
	
}
