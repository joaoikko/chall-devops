package br.com.fiap.carro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.carro.model.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo,Integer> {
}
