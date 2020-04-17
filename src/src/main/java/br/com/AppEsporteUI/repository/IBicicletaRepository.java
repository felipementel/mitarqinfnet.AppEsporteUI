package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.Bicicleta;

@Repository
public interface IBicicletaRepository extends CrudRepository<Bicicleta, Integer> {

}