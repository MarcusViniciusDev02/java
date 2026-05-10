public abstract class Ferramenta {
    private String nome;

    public Ferramenta() {
    }

    public Ferramenta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
