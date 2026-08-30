package dev.projetojava.PrimeiroProjetoSpring.Missoes;

import dev.projetojava.PrimeiroProjetoSpring.Ninjas.NinjaController;
import dev.projetojava.PrimeiroProjetoSpring.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor //Cria construtor sem argumentos
@AllArgsConstructor //Cria construtores com argumentos
@Data // Cria os getters e setters
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "missoes")// Uma missão pode ter vários ninjas.
    //mappedBy - Direciona para onde essa coluna vai ser mapeada.
    private List<NinjaModel> ninjas;

}
