package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.ItemVenda;

@Repository
public interface IItemVendaRepository extends CrudRepository<ItemVenda, Integer> {

}
