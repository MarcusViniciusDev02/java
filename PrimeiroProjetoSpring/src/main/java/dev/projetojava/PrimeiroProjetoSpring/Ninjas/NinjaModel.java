package dev.projetojava.PrimeiroProjetoSpring.Ninjas;

import dev.projetojava.PrimeiroProjetoSpring.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Java Persistence API = JPA
@Entity //Entity - Transforma uma classe em uma entidade no Banco de Dados
@Table(name = "tb_cadastro_de_ninjas") //Cria uma tabela para a entidade.
@NoArgsConstructor //Cria construtor sem argumentos
@AllArgsConstructor //Cria construtores com argumentos
@Data // Cria os getters e setters
public class NinjaModel {

    @Id // O atributo abaixo será um Id na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Cria estratégia de como o ID será criado.
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(unique = true) //Coloco essa coluna como única.
    private String email;
    @Column(name = "imgUrl")
    private String imgUrl;
    @Column(name = "idade")
    private int idade;
    @ManyToOne  //Cada ninja só poderá participar uma única missão.
    @JoinColumn(name = "missoes_id") //@joinColumn - Cria um agrupamento de colunas.
    private MissoesModel missoes;

}
