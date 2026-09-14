public abstract class Ninja {
    
    private String nome;
    private int idade;

    public Ninja() {
    }

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirNome(){
        System.out.println("Meu nome é " + getNome() + ".");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

}
