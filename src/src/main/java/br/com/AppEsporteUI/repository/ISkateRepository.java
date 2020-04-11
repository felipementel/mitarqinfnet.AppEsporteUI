package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.Skate;

@Repository
public interface ISkateRepository extends CrudRepository<Skate, Integer> {

}