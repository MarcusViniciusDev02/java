package dev.projetojava.PrimeiroProjetoSpring.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
//ORM - Escaneia o que tem na classe e traduz para uma tabela, criando colunas.