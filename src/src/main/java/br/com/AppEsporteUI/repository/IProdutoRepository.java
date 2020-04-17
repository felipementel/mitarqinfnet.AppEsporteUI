package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}