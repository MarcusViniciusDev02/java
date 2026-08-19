package dev.projetojava.PrimeiroProjetoSpring.Missoes;

import dev.projetojava.PrimeiroProjetoSpring.NinjaController;
import dev.projetojava.PrimeiroProjetoSpring.Ninjas.NinjaModel;
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
    private List<NinjaController> NinjaController;

}
