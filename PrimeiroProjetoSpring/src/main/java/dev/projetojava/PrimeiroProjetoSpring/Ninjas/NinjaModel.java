package dev.projetojava.PrimeiroProjetoSpring;

import dev.projetojava.PrimeiroProjetoSpring.Missoes.MissoesModel;
import jakarta.persistence.*;


//Java Persistence API = JPA

@Entity //Entity - Transforma uma classe em uma entidade no Banco de Dados
@Table(name = "tb_cadastro_de_ninjas") //Cria uma tabela para a entidade.
public class NinjaModel {

    @Id // O atributo abaixo será um Id na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Cria estratégia de como o ID será criado.
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    //Cada ninja poderá ter uma única missão.
    @JoinColumn(name = "missoes_id")
    //@joinColumn - Cria um agrupamento de colunas.
    //Foreing Key - Chave estrangeira.
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
