public abstract class EquipamentosNinja{
    private String nome;
    private int indice;

    public EquipamentosNinja() {
    }

    public EquipamentosNinja(String nome, int indice) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Equipamento: " + nome;
    }
}
