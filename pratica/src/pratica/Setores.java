package pratica;

public enum Setores {
	AMBULATORIO("Local de atendimentos agendados."),
	EMERGENCIA("Atendimentos de emergência."),
	CER("Recepção e classificação de risco.");
	

	
	
	private Setores(String descricao) {
		Descricao = descricao;
	}


	private String Descricao;
	
	
	public String getDescricao() {
		return Descricao;
	}

	
	
	
}
