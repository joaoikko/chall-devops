package br.com.fiap.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.carro.model.Carro;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

    //Pesquisar por parte do nome ignorando case sensitive
    List<Carro> findByNomeContainsIgnoreCase(String nome);

    //Pesquisar os atletas de uma modalidade
    List<Carro> findByModelo_Codigo(int codigo);

}
