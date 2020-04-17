package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.Bodyboard;

@Repository
public interface IBodyboardRepository extends CrudRepository<Bodyboard, Integer> {

}