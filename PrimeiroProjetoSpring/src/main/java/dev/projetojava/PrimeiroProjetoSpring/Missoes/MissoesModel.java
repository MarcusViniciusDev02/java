package dev.projetojava.PrimeiroProjetoSpring.Missoes;

import dev.projetojava.PrimeiroProjetoSpring.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "missoes")
    // Uma missão pode ter vários ninjas.
    //mappedBy - Direciona para onde essa coluna vai ser mapeada.
    private List<NinjaModel> ninjas;

    public MissoesModel(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

}
