package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.Venda;

@Repository
public interface IVendaRepository extends CrudRepository<Venda, Integer> {

}
